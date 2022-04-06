package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.HomePage;
import pages.UserRegistrationPage;
import tests.TestBase;

public class UserRegistration extends TestBase {

    HomePage home;
    UserRegistrationPage register;

    @Given("the user in the homepage")
    public void the_user_in_the_homepage() {
        // Write code here that turns the phrase above into concrete actions
        home = new HomePage(driver);
        home.openRegistrationPage();
    }
    @When("he clicks on the register link")
    public void he_clicks_on_the_register_link() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }
//    @When("enters his data")
//    public void enters_his_data() {
//        // Write code here that turns the phrase above into concrete actions
//        register = new UserRegistrationPage(driver);
//        register.userRegistration("Mohammed", "Taher", "test@test.com", "123456");
//    }

    @When("enters his {string}, {string}, {string}, {string}")
    public void enters_his(String firstname, String lastname, String email, String password) {
        // Write code here that turns the phrase above into concrete actions
        register = new UserRegistrationPage(driver);
        register.userRegistration(firstname, lastname, email, password);
    }

    @Then("the registration page should be displayed successfully")
    public void the_registration_page_should_be_displayed_successfully() {
        // Write code here that turns the phrase above into concrete actions
        register.userlogout();
    }

}
