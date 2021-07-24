package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private static WebDriver driver;

    @FindBy(xpath = "//h5[normalize-space()='Elements']")
    private WebElement element;

    public void clickOnElements(){
        element.click();
    }
}
