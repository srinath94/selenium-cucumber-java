package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //@FindBy(xpath = "//div[@class='category-cards']//div[1]//div[1]//div[1]")
  //  private WebElement element;

    public ElementsPage clickOnElements(){
        //Actions act =  new Actions(driver);
       // act.moveToElement(element).click().perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector(\"div[class='category-cards'] div:nth-child(1) div:nth-child(1) div:nth-child(3) h5:nth-child(1)\")");
        return new ElementsPage(driver);
    }
}
