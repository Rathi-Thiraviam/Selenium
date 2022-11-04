package WindowsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Amazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
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
        System.out.println(l.getText());
        driver.findElement(By.id("signInSubmit")).click();
        WebElement element= driver.findElement(By.id("nav-logo-sprites"));
        boolean result = element.isEnabled();
        System.out.println("The return value: " +result);
        driver.close();
    }
}













//        driver.switchTo().activeElement();
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kurti for women");
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
//        driver.findElement(By.id("//a[@id='nav-link-accountList']")).click();
//        driver.findElement(By.id("//span[text()='Sign in']
//        parent::span[text()='Sign in' and @class='nav-action-inner']//parent::a//parent::div[@id='nav-flyout-ya-signin']")).click();