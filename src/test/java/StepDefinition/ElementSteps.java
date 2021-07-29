package StepDefinition;

import Pages.ElementsPage;
import Pages.HomePage;
import Pages.TextBoxPage;
import Support.BrowserCreation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ElementSteps {

    WebDriver driver = new BrowserCreation().getDriver();
    ElementsPage elementsPage = new ElementsPage(driver);
    TextBoxPage textBoxPage =new TextBoxPage(driver);

    @Given("I click on TextBox option")
    public void i_click_on_text_box_option() {
         elementsPage.clickOnTextBox();
    }

    @When("I enter text in all the available fields")
    public void i_enter_text_in_all_the_available_fields() {
        textBoxPage.enterTextInFullNameField("Srinath Duvva");
    }

    @Then("I should be able to save it by clicking on submit")
    public void i_should_be_able_to_save_it_by_clicking_on_submit() {
       textBoxPage.clickOnSubmitButton();
    }

    /*@Given("I click on check box option")
    public void i_click_on_check_box_option() {

    }

    @When("I expend the Home option")
    public void i_expend_the_home_option() {

    }

    @Then("I should be able to select any of the Notes in the page")
    public void i_should_be_able_to_select_any_of_the_notes_in_the_page() {

    }*/
}
