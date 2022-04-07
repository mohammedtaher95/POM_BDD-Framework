package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.HomePage;
import pages.UserRegistrationPage;
import tests.TestBase;
import tests.UserFormData;

public class UserRegistration extends TestBase {

    HomePage home;
    UserRegistrationPage register;
    UserFormData newUser;

    @Given("the user in the homepage")
    public void the_user_in_the_homepage() {
        // Write code here that turns the phrase above into concrete actions
        home = new HomePage(driver);
        newUser = new UserFormData();
        home.openRegistrationPage();
    }
    @When("he clicks on the register link")
    public void he_clicks_on_the_register_link() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }

    @When("enters his firstname, lastname, email, password")
    public void enters_his_firstname_lastname_email_password() {
        // Write code here that turns the phrase above into concrete actions
        register = new UserRegistrationPage(driver);
        register.userRegistration(newUser.getFirstName(), newUser.getLastName(), newUser.getEmail(), newUser.getPassword());
    }

    @Then("the registration page should be displayed successfully")
    public void the_registration_page_should_be_displayed_successfully() {
        // Write code here that turns the phrase above into concrete actions
        register.userlogout();
    }

}
