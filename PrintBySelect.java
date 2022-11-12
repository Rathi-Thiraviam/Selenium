package WindowsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class PrintBySelect {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///E:/Website%20creation/table.html");
        List <WebElement> name =driver.findElements(By.tagName("th"));
        int columnCount=name.size();
        System.out.println("Number of columns \n" +columnCount);
        List <WebElement> row =driver.findElements(By.tagName("tr"));
        int rowCount=row.size();
        System.out.println("Number of rows \n" +rowCount);

        //Print the name by using "Fail"

        List <WebElement> PersonName=driver.findElements(By.xpath("//td[normalize-space()='Fail']//preceding-sibling::td[2]"));
        System.out.println(PersonName.size());
        for (WebElement nameCount : PersonName)
        {
            String val= nameCount.getText();
            System.out.println(val);
        }
        Thread.sleep(3000);

        //Finding all the web element in "Total" column

        //List total=driver.findElements(By.xpath("//th[text()='Total']/tbody/tr/td[]/../td[3]"));
        List <WebElement> total = driver.findElements(By.xpath("//td[3]"));
        System.out.println(total.size());
        List<Integer> numberList=new ArrayList<Integer>();
        for (WebElement tdCount: total)
        {
            String td=tdCount.getText();
            numberList.add(Integer.parseInt(td));
        }
        Thread.sleep(3000);
        System.out.println("Final total value is" +numberList);

        //All names print in console

        List <WebElement> Pname = driver.findElements(By.xpath("//td[2]"));
        System.out.println(Pname.size());
        for (WebElement allNames: Pname)
        {
            String names= allNames.getText();
            System.out.println(names);
        }
        Thread.sleep(3000);
        driver.close();
    }
}
