import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import static org.junit.Assert.assertEquals;


public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/lcarosella/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Smith");
        driver.findElement(By.id("job-title")).sendKeys("President");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.cssSelector("option[value='4']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("12/26/2021");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        //WebDriverWait waitForSuccess = new WebDriverWait(driver, 10);
        //WebElement alertSuccess = waitForSuccess.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

        //String alertText = alertSuccess.getText();


        driver.quit();
    }
}
