package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Collections;
import java.util.Set;

public class Driver {

    public static WebDriver driver;
    private static Logger logger = LoggerFactory.getLogger(Driver.class);

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--kiosk");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-fullscreen");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie cookie : allCookies) {
            driver.manage().deleteCookieNamed(cookie.getName());
        }
        logger.info("WebDriver starts succesfully!");
    }
    @After
    public void tearDown() {
        driver.quit();
        logger.info("WebDriver quits succesfully!");
    }
}
