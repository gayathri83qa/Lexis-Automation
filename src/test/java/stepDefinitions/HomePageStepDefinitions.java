package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LexisNexisHomePage;


import static org.junit.Assert.assertTrue;

public class HomePageStepDefinitions {

    private WebDriver driver;
    private LexisNexisHomePage homePage;

    @Given("^I open the LexisNexis homepage$")
    public void openHomePage() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        homePage = new LexisNexisHomePage(driver);
        driver.get("https://risk.lexisnexis.co.uk/");
    }

    @Then("^the Financial Services link is present and clickable$")
    public void verifyFinancialServicesLink() {
        assertTrue(homePage.isFinancialServicesLinkClickable());
    }

    @Then("^the Insurance link is present and clickable$")
    public void verifyInsuranceLink() {
        assertTrue(homePage.isInsuranceLinkClickable());
    }

    @Then("^the Life and Pensions link is present and clickable$")
    public void verifyLifeAndPensionsLink() {
        assertTrue(homePage.isLifeAndPensionsLinkClickable());
    }

    @Then("^the Corporations and Non-Profits link is present and clickable$")
    public void verifyCorporationsAndNonProfitsLink() {
        assertTrue(homePage.isCorporationsAndNonProfitsLinkClickable());
    }

    @When("^I select Financial Services under Choose your Industry tab$")
    public void selectFinancialServicesIndustry() {
        homePage.selectFinancialServicesIndustry();
    }
}


