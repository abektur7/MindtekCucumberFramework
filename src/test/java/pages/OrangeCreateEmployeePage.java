package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

    public class OrangeCreateEmployeePage {
        public OrangeCreateEmployeePage(){

            WebDriver driver= Driver.getDriver();
            PageFactory.initElements(driver,this);

        }
        @FindBy(linkText = "Admin")
        public WebElement adminBtn;
        @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
        public WebElement addBtn;

        @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")
        public WebElement BtnPIM;

    }

