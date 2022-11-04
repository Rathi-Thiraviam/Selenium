package WindowsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Codoid\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://www.leafground.com/pages/Window.html");
        Thread.sleep(3000);
        String str = driver.getTitle();
        System.out.println(str);
        String oldWindow = driver.getWindowHandle();
        WebElement firstButton = driver.findElement(By.id("home"));
        firstButton.click();
        driver.getWindowHandles();
    }
}
