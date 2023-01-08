package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeAppAddEmployeePage {

    public OrangeAppAddEmployeePage(){

        WebDriver driver= Driver.getDriver();
        PageFactory.initElements(driver,this);

    }

    @FindBy (xpath = "//input[@placeholder='First Name']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    public WebElement id;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement saveBtn;



}
