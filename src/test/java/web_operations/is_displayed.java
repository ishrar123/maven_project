package web_operations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_displayed {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com");
        //driver.findElement(By.className("dropdown-menu dropdown-menu-right");
        driver.findElement(By.linkText("My Account")).click();
        boolean bol = driver.findElement(By.name("email")).isDisplayed();

        if (bol) {
            System.out.println("test case passed");
        }

    }
}
