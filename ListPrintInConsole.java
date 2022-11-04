package WindowsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListPrintInConsole {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.justdial.com/Bangalore/Bakeries");

        List<WebElement> bakeries = driver.findElements(By.className("store-name"));

        System.out.println(bakeries.size());

        for (WebElement webElement : bakeries) {
            String name = webElement.getText();
            System.out.println(name);
        }
    }
}