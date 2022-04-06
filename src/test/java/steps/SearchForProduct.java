package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.ProductDetailsPage;
import pages.SearchPage;
import tests.TestBase;

public class SearchForProduct extends TestBase {

    SearchPage SearchObject;
    ProductDetailsPage ProductObject;

    // Scenario 1: User can Search for product by writing in the search bar and clicks on search button

    @Given("The user is in the homepage")
    public void the_user_is_in_the_homepage() {
        SearchObject = new SearchPage(driver);
        ProductObject = new ProductDetailsPage(driver);
    }
    @When("he writes the product name {string} in the search bar and clicks on the search button")
    public void he_writes_the_product_name_in_the_search_bar_and_clicks_on_the_search_button(String ProductName) {
        SearchObject.ProductSearch(ProductName);
    }
    @When("clicks on the product from the results page")
    public void clicks_on_the_product_from_the_results_page() {
        SearchObject.OpenProductPage();
    }
    @Then("the product details page should open successfully with {string}")
    public void the_product_details_page_should_open_successfully_with(String ProductName) {
        Assert.assertTrue(ProductObject.productNameBreadCrumb.getText().equalsIgnoreCase(ProductName));
    }

    // Scenario 2: User can Search for product using auto-suggestion

    @When("he writes a keyword for the product name {string} in the search bar and clicks on the suggested result")
    public void he_writes_a_keyword_for_the_product_name_in_the_search_bar_and_clicks_on_the_suggested_result(String keyword) throws InterruptedException {
        SearchObject.ProductSearchUsingAutoSuggest(keyword);
    }
    @Then("the product details page should be opened successfully with {string}")
    public void the_product_details_page_should_be_opened_successfully_with(String ProductName) {
        Assert.assertTrue(ProductObject.productNameBreadCrumb.getText().equalsIgnoreCase(ProductName));
    }

}

