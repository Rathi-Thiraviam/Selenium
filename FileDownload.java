package WindowsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class FileDownload {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Codoid\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/file.xhtml");
//        ChromeOptions profile = new ChromeOptions();
//        profile.addPreference("browser.download.folderList",  2);
//        profile.addPreference("browser.download.dir", "C:\Users\ghs6kor\Documents\Download");
        WebElement file=driver.findElement(By.xpath("//button[@id='j_idt93:j_idt95']/descendant::span[text()='Download']"));
        file.click();
        Thread.sleep(4000);
        File fileLocation=new File("C:\\Users\\CODOID\\Downloads");
        File[] totalFiles=fileLocation.listFiles();
        for (File files: totalFiles)
        {
            if (files.getName().equals("TestLeaf Logo.png"));
            System.out.println("The file is present");
            System.out.println(fileLocation);
            break;
        }
        driver.close();
    }
}
