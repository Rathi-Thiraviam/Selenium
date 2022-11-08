package WindowsAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdown {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//        String str = driver.getTitle();
//        System.out.println(str);
        System.out.println(driver.getTitle());
        WebElement allOptions = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select Select2 = new Select(allOptions);
        List<WebElement> Listofoption = Select2.getOptions();
        for (WebElement elmntOptions : Listofoption) {
            System.out.println(elmntOptions.getText());
        }
        driver.close();
    }
}