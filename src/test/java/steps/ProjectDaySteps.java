package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.OrangeCreateEmployeePage;
import pages.OrangeLoginPage;
import utilities.Driver;


    public class ProjectDaySteps {
        WebDriver driver = Driver.getDriver();
        OrangeLoginPage orangeLoginPage = new OrangeLoginPage();
        OrangeCreateEmployeePage orangeCreateEmployeePage = new OrangeCreateEmployeePage();

        @When("user enters username {string} and password {string} and clicks on login button and creates employee")
        public void userEntersUsernameAndPasswordAndClicksOnLoginButtonAndCreatesEmployee(String username, String password) throws InterruptedException {
            orangeLoginPage.username.sendKeys(username);
            orangeLoginPage.password.sendKeys(password);
            orangeLoginPage.loginBtn.click();

            orangeCreateEmployeePage.adminBtn.click();
            orangeCreateEmployeePage.addBtn.click();

            WebElement dropdown1 = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));

            dropdown1.click();
            Thread.sleep(3000);
            dropdown1.sendKeys(Keys.ARROW_DOWN);
            dropdown1.sendKeys(Keys.ARROW_DOWN);
            dropdown1.click();

            WebElement dropdown2 = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
            dropdown2.click();
            Thread.sleep(3000);
            dropdown2.sendKeys(Keys.ARROW_DOWN);
            dropdown2.click();
        }


    }
