package WindowsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internetexplorer {

    public static void main(String args[]) {
        System.setProperty("webdriver.ie.driver", "C:\\Users\\CODOID\\Downloads\\IEDriverServer_x64_4.6.0\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        WebElement text= driver.findElement(By.xpath("//h2[text()='\u200B\u200B\u200BGreat gifts for everyone']"));
        text.getText();
        System.out.println(text);
        driver.close();
    }
}
