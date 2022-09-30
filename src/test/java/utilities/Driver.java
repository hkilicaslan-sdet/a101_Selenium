package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class Driver {
    private static WebDriver driver;
    private static int timeout = 5;
    private Driver() {
    }
    public static WebDriver getDriver() {
        ChromeOptions obj = new ChromeOptions();
        obj.addArguments("--disable-notifications");

        if (driver == null) {
            String browser = ConfigReader.getProperty("browser");
            if ("chrome".equals(browser)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(obj);
            } else if ("chrome-headless".equals(browser)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.manage().window().maximize();
        return driver;
    }
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}