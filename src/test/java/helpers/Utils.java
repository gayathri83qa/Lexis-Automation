package helpers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utils {
    private static WebDriver driver;

    // Initialize WebDriver
    public static void initializeWebDriver() {
        // Set Chrome driver path
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Configure Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Maximize browser window

        // Initialize ChromeDriver
        driver = new ChromeDriver(options);
    }

    // Close WebDriver
    public static void closeWebDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Wait for element to be clickable
    public static WebElement waitForElementClickable(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    // Take screenshot
    public static void takeScreenshot(String fileName) {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Path destination = Paths.get("screenshots", fileName + ".png");

        try {
            Files.createDirectories(destination.getParent());
            Files.copy(screenshotFile.toPath(), destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Log message
    public static void log(String message) {
        System.out.println(message);
    }

    // Example usage
    public static void main(String[] args) {
        initializeWebDriver();
        driver.get("https://example.com");

        WebElement element = waitForElementClickable(By.id("exampleId"), 10);
        element.click();

        takeScreenshot("exampleScreenshot");

        log("Example log message");

        closeWebDriver();
    }
}
