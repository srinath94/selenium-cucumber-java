package Support;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class BrowserCreation {
    public static WebDriver driver;

    @Before
    public static void setUp() throws IOException {
        PropertiesReader propertiesReader = new PropertiesReader();
        propertiesReader.LoadProperties();
        if (PropertiesReader.browser_type.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver =new ChromeDriver();
        }else if (PropertiesReader.browser_type.equalsIgnoreCase("FireFox")){
            WebDriverManager.firefoxdriver().setup();
            driver =new FirefoxDriver();
        }
        driver.get(PropertiesReader.page_url);
        driver.manage().window().maximize();
    }

    @After
    public static void quitBrowser(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
