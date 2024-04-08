package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LexisNexisHomePage {
    private WebDriverWait wait;

    // Constructor
    public LexisNexisHomePage(WebDriver driver) {
        wait = new WebDriverWait(driver, 10);
    }

    // Locators
    private By industryTabLink = By.xpath("//a[contains(text(),'Choose your Industry')]");
    private By financialServicesOption = By.xpath("//div[@id='tab-content-1']//a[contains(text(),'Financial Services')]");
    private By financialServicesLink = By.linkText("Financial Services");
    private By insuranceLink = By.linkText("Insurance");
    private By lifeAndPensionsLink = By.linkText("Life and Pensions");
    private By corporationsAndNonProfitsLink = By.linkText("Corporations and Non-Profits");
    private By financialCrimeComplianceLink = By.linkText("Financial Crime Compliance");
    private By fraudAndIdentityManagementLink = By.linkText("Fraud and Identity Management");
    private By customerDataManagementLink = By.linkText("Customer Data Management");
    private By creditRiskAssessmentLink = By.linkText("Credit Risk Assessment");
    private By collectionsAndRecoveryLink = By.linkText("Collections & Recovery");
    private By tracingAndInvestigationsLink = By.linkText("Tracing and Investigations");

    // Actions
    public void clickIndustryTab() {
        WebElement tab = wait.until(ExpectedConditions.elementToBeClickable(industryTabLink));
        tab.click();
    }

    public void selectFinancialServicesIndustry() {
        clickIndustryTab();
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(financialServicesOption));
        option.click();
    }

    public boolean isFinancialServicesLinkClickable() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(financialServicesLink));
        return link.isDisplayed() && link.isEnabled();
    }

    public boolean isInsuranceLinkClickable() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(insuranceLink));
        return link.isDisplayed() && link.isEnabled();
    }

    public boolean isLifeAndPensionsLinkClickable() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(lifeAndPensionsLink));
        return link.isDisplayed() && link.isEnabled();
    }

    public boolean isCorporationsAndNonProfitsLinkClickable() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(corporationsAndNonProfitsLink));
        return link.isDisplayed() && link.isEnabled();
    }

    public boolean isFinancialCrimeComplianceLinkClickable() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(financialCrimeComplianceLink));
        return link.isDisplayed() && link.isEnabled();
    }

    public boolean isFraudAndIdentityManagementLinkClickable() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(fraudAndIdentityManagementLink));
        return link.isDisplayed() && link.isEnabled();
    }

    public boolean isCustomerDataManagementLinkClickable() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(customerDataManagementLink));
        return link.isDisplayed() && link.isEnabled();
    }

    public boolean isCreditRiskAssessmentLinkClickable() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(creditRiskAssessmentLink));
        return link.isDisplayed() && link.isEnabled();
    }

    public boolean isCollectionsAndRecoveryLinkClickable() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(collectionsAndRecoveryLink));
        return link.isDisplayed() && link.isEnabled();
    }

    public boolean isTracingAndInvestigationsLinkClickable() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(tracingAndInvestigationsLink));
        return link.isDisplayed() && link.isEnabled();
    }
}
