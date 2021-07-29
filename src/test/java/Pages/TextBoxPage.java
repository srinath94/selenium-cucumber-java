package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {

    private final WebDriver driver;

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement fullNameField;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public TextBoxPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterTextInFullNameField(String text){
        fullNameField.sendKeys(text);
    }

    public void clickOnSubmitButton(){
        Actions act =  new Actions(driver);
        act.moveToElement(submitButton).click().perform();
    }
}
