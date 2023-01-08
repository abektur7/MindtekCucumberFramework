package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.RedShelfHomePage;
import pages.RedShelfProductPage;
import pages.RedShelfSearchPage;
import utilities.Driver;

public class RedShelfSteps {

        WebDriver driver = Driver.getDriver();
        RedShelfSearchPage searchPage = new RedShelfSearchPage();
        RedShelfHomePage homePage = new RedShelfHomePage();
        RedShelfProductPage productPage = new RedShelfProductPage();

        private static final String IN_CART = "IN CART";

       // @Given("user navigates to {string} webpage")
      //  public void user_navigates_to_webpage(String link) {
      //      driver.get(link);
     //   }

        @When("user searches {string} book")
        public void user_searches_book(String book) {
            homePage.searchBox.sendKeys(book + Keys.ENTER);
        }

        @When("user choose first book in search result")
        public void user_choose_first_book_in_search_result() {
            searchPage.books.get(0).click();
        }

        @When("user clicks on Add To Cart button")
        public void user_clicks_on_add_to_cart_button() {
            productPage.addToCartButton.click();
        }

        @Then("user clicks on view cart button and validates book is in cart")
        public void user_clicks_on_view_cart_button_and_validates_book_is_in_cart() {
            Assert.assertEquals(productPage.inCartLabel.getText(), IN_CART);
        }

        @Then("user validates first result page having no more than {int} books.")
        public void user_validates_first_result_page_having_no_more_than_books(Integer amount) {
            Assert.assertTrue(searchPage.books.size() <= amount);
        }
    }

