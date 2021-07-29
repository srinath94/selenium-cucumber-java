package Support;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BrowserCreation {
    public static WebDriver driver;

    @Before
    public void setUp() throws IOException {
        PropertiesReader propertiesReader = new PropertiesReader();
        propertiesReader.LoadProperties();
        if (PropertiesReader.browser_type.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
        }else if (PropertiesReader.browser_type.equalsIgnoreCase("FireFox")){
            WebDriverManager.firefoxdriver().setup();
            driver =new FirefoxDriver();
        }
        driver.get(PropertiesReader.page_url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @After
    public static void quitBrowser(){
        driver.quit();
    }

    public  WebDriver getDriver() {
        return driver;
    }
}
