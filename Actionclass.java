package WindowsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

    public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        WebElement link_Home = driver.findElement(By.xpath("//input[@type='text']"));
        //driver.get("https://www.amazon.com/");
//        driver.navigate().to("https://www.google.com/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//        WebElement elm= driver.findElement(By.xpath("//input[@name='q'']"));
        String str = driver.getTitle();
        System.out.println(str);
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .sendKeys(link_Home, "kesavan")
                .click()
                .build();
        mouseOverHome.perform();
    }
}
