package web_operations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dynamic_webtable {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("file:///C:/Users/Lenovo/Downloads/WbTable.html");
        driver.manage().window().maximize();

        //find the number of rows in the table
        List<WebElement> l1=driver.findElements(By.xpath("html/body/table/tbody/tr"));
        int row=l1.size();
        // print the rows in the table
        System.out.println(row);

        // find the number of columns in the table
        List<WebElement> l2=driver.findElements(By.xpath("html/body/table/tbody/tr[2]/th"));
        int column=l2.size();
        // print the number of columns in the table
        System.out.println(column);
        // first loop is for row
        for(int i=3;i<=row;i++){
            // second loop is for column
            for(int j=1;j<=column;j++){
                System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+ "] / td["+j+"]")).getText());
            }
        }


    }

}
