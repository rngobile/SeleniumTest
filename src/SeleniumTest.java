/**
 * Created by Richard on 3/11/2016.
 */
import java.util.Scanner.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files (x86)\\Java\\jdk1.8.0_65\\lib\\selenium-2.52.0\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        String email = args[0];
        String pass = args[1];

        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(pass);
        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(9000);
        driver.findElement(By.id("userNavigationLabel")).click();
        driver.findElement(By.id("u_21_2")).click();
    }
}
