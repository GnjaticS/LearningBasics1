import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Main {
        WebDriver driver;
        WebDriverWait wait;

        @BeforeClass
    public void setUp(){
            WebDriverManager.chromedriver().setup();

        }
        @BeforeMethod
    public void pageSetUp(){
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            driver.manage().window().maximize();
            driver.get("https://practicetestautomation.com/");
            // WebElement practice = driver.findElement(By);

        }



}
