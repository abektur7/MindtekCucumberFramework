package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RedShelfHomePage {

        private final WebDriver driver;

        public RedShelfHomePage() {
            this.driver = Driver.getDriver();
            PageFactory.initElements(driver, this);
        }

        @FindBy(id = "search-catalog-navbar")
        public WebElement searchBox;
    }


