package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage {

    private static WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Text Box']")
    WebElement textBox;

}
