package WindowsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class BackgroundColor {

    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tnpsc.gov.in/");
        driver.manage().window().maximize();
        //getting color attribute with getCssValue()
        WebElement color = driver.findElement(By.xpath("//li/child::a[text()='Apply Online' and @class='confirmation' and @target='_blank']"));
               String Col= color.getCssValue("color");
        String rgbFormat = color.getCssValue("background-color");

        System.out.println(rgbFormat);     //In RGB Format the value will be print => rgba(254, 189, 105, 1)

        String hexcolor = Color.fromString(rgbFormat).asHex(); //converted Into HexFormat
        System.out.println(hexcolor);
        //getting background color attribute with getCssValue()

        String backgroundColor = driver.findElement(By.xpath("//li/child::a[text()='Apply Online' and @class='confirmation' and @target='_blank']"))
                .getCssValue("background-color");
        System.out.println(Col);
        System.out.println(backgroundColor);
        driver.close();
    }
}
