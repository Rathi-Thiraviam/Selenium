package WindowsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Launch {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Codoid\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://mlm.pearson.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[@class='left' and @aria-hidden='true' and @data-icon='']//parent::a")).click();        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("aditi.dogra@pearson.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password1");
        driver.findElement(By.xpath("//button[@id='mainButton']")).submit();
        System.out.println("sign in button is not clicked");

        driver.findElement(By.xpath("//input[@id='keywordTextbox']")).sendKeys("dogra89434");

    }
}
