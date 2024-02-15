package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactListContactPage;
import pages.ContactListHomePage;
import utilities.Driver;

public class ContactListStepDefinitions {

    ContactListHomePage contactListHomePage = new ContactListHomePage();
    ContactListContactPage contactListContactPage = new ContactListContactPage();

    @Given("user goes to {string}")
    public void user_goes_to(String url) {

        Driver.getDriver().get(url);

    }
    @When("user enters mail {string}")
    public void user_enters_mail(String mail) {

        contactListHomePage.username.sendKeys(mail);

    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {

        contactListHomePage.password.sendKeys(password);

    }
    @When("user clicks submit button")
    public void user_clicks_submit_button() {

        contactListHomePage.submit.click();

    }
    @Then("assert logout button")
    public void assert_logout_button() {

        assert contactListContactPage.logout.isDisplayed(); //java assertion

    }


    @And("user closes browser")
    public void userClosesBrowser() {

        Driver.closeDriver();

    }
}
