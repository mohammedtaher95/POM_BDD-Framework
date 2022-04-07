package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.ContactUsPage;
import pages.HomePage;
import tests.UserFormData;
import tests.TestBase;
import tests.UserFormData;

public class ContactUs extends TestBase {

    HomePage HomeObject;
    ContactUsPage ContactObject;

    String SuccessMessage = "Your enquiry has been successfully sent to the store owner.";

    UserFormData contact = new UserFormData();

    @When("he clicks on Contact us link")
    public void he_clicks_on_contact_us_link() {
        HomeObject = new HomePage(driver);
        ContactObject = new ContactUsPage(driver);
        HomeObject.openContactUsPage();
    }
    @When("Submits his Full Name, Email, and Address in the form")
    public void submits_his_and_in_the_forms() {
        ContactObject.FillContactInfoForm(contact.getFullName(), contact.getEmail(), contact.getMessage());
    }
    @Then("a success message should be displayed after submitting the form")
    public void a_success_message_should_be_displayed_after_submitting_the_form() {
        Assert.assertTrue(ContactObject.successMessage.getText().equalsIgnoreCase(SuccessMessage));
    }
}
