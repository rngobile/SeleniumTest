import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Richard on 3/12/2016.
 */
public class SeleniumMouseOver {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Java\\jdk1.8.0_65\\lib\\selenium-2.52.0\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://flex.apache.org");
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[4]/a"));

        Actions action = new Actions(driver);

        action.moveToElement(menu).perform();
        Thread.sleep(2000);
        action.click(subMenu).perform();

        driver.close();
    }
}
