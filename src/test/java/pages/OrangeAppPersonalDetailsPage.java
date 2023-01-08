package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeAppPersonalDetailsPage {
    public OrangeAppPersonalDetailsPage(){

        WebDriver driver= Driver.getDriver();
        PageFactory.initElements(driver,this);

    }

    @FindBy (xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    @FindBy (xpath = "//span[normalize-space()='Admin']")
    public WebElement adminBtn;
}
