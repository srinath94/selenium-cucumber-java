package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    final private WebDriver driver;
    @FindBy(xpath = "//*[contains(text(), 'Elements')]")
    private WebElement element;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnElements() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
        js.executeScript("arguments[0].click()", element);
    }
}
