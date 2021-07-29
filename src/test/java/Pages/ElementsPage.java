package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {

    final private WebDriver driver;

    public ElementsPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-0']")
    WebElement textBox;

    public void clickOnTextBox(){
        Actions act =  new Actions(driver);
      act.moveToElement(textBox).click().perform();

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("document.querySelector(\"div[class='element-list collapse show'] li[id='item-0']\")");


    }

}
