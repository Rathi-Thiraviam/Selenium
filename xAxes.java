package WindowsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class xAxes {
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(400));
        String str = driver.getTitle();
        System.out.println(str);
        driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
        // driver.findElement(By.id("//a[@id='nav-hamburger-menu']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8870360359");
        driver.findElement(By.id("continue")).click();
        WebElement l =driver.findElement(By.xpath("//input[@type='password']"));
        l.sendKeys("AmmaAppa1234");
        String val = l.getAttribute("value");
        System.out.println("Entered text is: " + val);

       //Using getText() method

        System.out.println(l.getText());
        driver.findElement(By.id("signInSubmit")).click();

        //Using Child class, Preceding siblings & and

        WebElement element = driver.findElement(By.xpath("//div[@id='nav-xshop-container']/child::div[@id='nav-xshop']/child::a[text()='Disability Customer Support' and @class='nav-hidden-aria  ']/preceding-sibling::a[text()='Sell']"));
        boolean result = element.isDisplayed();
        System.out.println("Your selected path is:" +result);

        //Using parent class

        WebElement elm = driver.findElement(By.xpath("//a[@class='nav-a  ']/parent::div[@id='nav-xshop']"));
        boolean resu = elm.isDisplayed();
        System.out.println("Your selected path is:" +resu);

        //Using Child class

        WebElement el = driver.findElement(By.xpath("//a[@class='nav-a  ']/following-sibling::a[text()='Buy Again']"));
        boolean res = el.isDisplayed();
        System.out.println("Your selected path is:" +res);

        //Using Ancestor
        driver.findElement(By.xpath("//a[text()='Disability Customer Support']/ancestor::div[@id='nav-xshop-container']"));
        driver.close();
    }
}
