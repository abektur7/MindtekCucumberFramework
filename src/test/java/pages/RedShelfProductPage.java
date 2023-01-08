package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RedShelfProductPage {
        private final WebDriver driver;

        public RedShelfProductPage() {
            this.driver = Driver.getDriver();
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//button[@data-role='offering-options-add-to-cart-button']")
        public WebElement addToCartButton;

        @FindBy(xpath = "//span[@data-role='offering-in-cart']")
        public WebElement inCartLabel;
    }

