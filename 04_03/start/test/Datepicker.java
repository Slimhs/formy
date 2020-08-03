import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/git/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datepicker = driver.findElement(By.id("datepicker"));
        Thread.sleep(1000);
        datepicker.click();

        datepicker.sendKeys("02/07/2020");
        datepicker.sendKeys(Keys.RETURN);

        //or

        /*
        WebElement day = driver.findElement(By.cssSelector("td[data-date='1595635200000']"));
        Thread.sleep(1000);
        day.click();
        */

        Thread.sleep(2000);
        driver.quit();
    }
}