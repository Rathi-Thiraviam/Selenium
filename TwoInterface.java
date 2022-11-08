package WindowsAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class TwoInterface {
    public static void main(String[] args) {
        String str ="Edge";
        if (str.equals("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            //driver.get("https://www.amazon.com/");
            driver.navigate().to("https://www.amazon.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            String str1 = driver.getTitle();
            System.out.println(str1);
        }
        else
        {
            System.setProperty("webdriver.ie.driver", "C:\\Users\\CODOID\\Downloads\\IEDriverServer_x64_4.6.0\\IEDriverServer.exe");
            WebDriver driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.amazon.com/");
            System.out.println(driver.getTitle());
        }
    }
}
