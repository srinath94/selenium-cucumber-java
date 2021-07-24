package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage {
    private WebDriver driver;

    @FindBy(id = "userName")
    private WebElement fullNameField;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public void enterTextInFullNameField(String text){
        fullNameField.sendKeys(text);
    }

    public void clickOnSubmitButton(){
        submitButton.click();
    }
}
