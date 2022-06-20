package practice;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Slf4j
public class BrowserTest {

    ChromeDriver driver;

    @BeforeTest
    public void setProperties() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_APPEND_LOG_PROPERTY, "true");
    }

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        log.info("Initialise ChromeWebDriver");
        this.driver = new ChromeDriver();
        driver.get("https://google.lv");

    }
    @Test
    public void chromeDriverTest() {
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.manage().window().maximize();
        // <title>Google</title>
    }

    @AfterMethod (alwaysRun = true)
    public void closeBrowser() {
        log.info("CLosing ChromeWebDriver");
        driver.close();

    }
}
