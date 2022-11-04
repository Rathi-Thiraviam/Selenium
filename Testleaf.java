package WindowsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testleaf {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://www.testleaf.com");
        Thread.sleep(3000);
        String str = driver.getTitle();
        System.out.println(str);
        driver.findElement(By.linkText("Go to Home Page")).click();
        driver.findElement(By.partialLinkText("Go to")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
