package Testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tnpsc {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tnpsc.gov.in/");
        driver.manage().window().maximize();
        List<WebElement> list=driver.findElements(By.className("notice"));
        System.out.println(list.size());
        for (WebElement webElement: list)
        {
            String name = webElement.getText();
            System.out.println(name);
        }
        WebElement elm=driver.findElement(By.linkText("Apply Online"));
        elm.click();
        Alert alert=driver.switchTo().alert();
        String alertMsg= driver.switchTo().alert().getText();
        System.out.println(alertMsg);
        Thread.sleep(3000);
        alert.accept();
        System.out.println("You choose yes");
//        driver.getWindowHandle();
        List <WebElement> elm1=driver.findElements(By.partialLinkText("//div[text()[normalize-space() = 'அறிவிக்கைகள்']]/parent::a"));
        System.out.println(elm1.size());
        for (WebElement lists:elm1)
        {
            String st=lists.getText();
            System.out.println(st);
        }
        System.out.println("Test");
        Thread.sleep(8000);
        driver.close();
    }
}
