package WindowsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Codoid\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://jqueryui.com/droppable/");
        //driver.navigate().to("https://leafground.com/drag.xhtml");
        driver.switchTo().frame(0);
        WebElement From = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement To = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions action=new Actions(driver);
        action.clickAndHold(From).moveToElement(To).release(To).build().perform();
        WebElement str = driver.findElement(By.xpath("//p[text()='Dropped!']"));
        String name = str.getText();
        System.out.println(name);
        action.moveToElement(From);
        driver.quit();
        //actions.dragAndDrop(From, To).build().perform();
    }
}
