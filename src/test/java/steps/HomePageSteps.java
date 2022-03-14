package steps;

import base.Driver;
import io.cucumber.java.en.Given;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

import java.util.Locale;
import java.util.Random;


public class HomePageSteps {
    HomePage homePage;
    public static String url = "https://ruut.tech/";
    private Logger logger = Logger.getLogger(HomePageSteps.class);

    protected WebDriver driver = Driver.driver;
    private WebDriverWait wait = new WebDriverWait(driver, 15, 1000);
    protected Actions action = new Actions(driver);

    public void goToDefinedUrl() {
        driver.get(url);
        waitSeconds(2);
        Assert.assertEquals("Base URL isn't opened", url, driver.getCurrentUrl());
        logger.info(url + " page opened!");
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void typeOneByOne(By element, String text) {
        WebElement ele = driver.findElement(element);
        Random r = new Random();
        for (int i = 0; i < text.length(); i++) {
            try {
                Thread.sleep((int) (r.nextGaussian() * 15 + 100));
            } catch (InterruptedException e) {
            }
            String s = new StringBuilder().append(text.charAt(i)).toString();
            ele.sendKeys(s);
        }
    }

    public void checkMessage(String message) {
        Assert.assertTrue("The message is not visible!", isElementVisible(By.xpath("//*[contains(text(),'" + message + "')]"), 5));
        logger.info(message + " message has showed!");
    }

    public void checkMessageWithAssert(String message) {
        Assert.assertTrue("The message is not visible!", isElementVisible(By.xpath("//*[contains(text(),'" + message + "')]"), 5));
    }

    public void clickButtonAndCheckMessage(String button, String message) {
        if (button.toUpperCase().equals("SURUCU")) {
            waitForElementAndClick(HomePage.SURUCU);
            logger.info(button + " button clicked.");
            checkMessage(message);
        } else if (button.toUpperCase().equals("MOTORCU")) {
            waitForElementAndClick(HomePage.MOTORCU);
            logger.info(button + " button clicked.");
            checkMessage(message);
        } else if (button.toUpperCase().equals("REKLAMCI")) {
            waitForElementAndClick(HomePage.REKLAMCI);
            logger.info(button + " button clicked.");
            checkMessage(message);
        } else if (button.toUpperCase().equals("EKRAN_YATIRIMCISI")) {
            waitForElementAndClick(HomePage.EKRAN_YATIRIMCISI);
            logger.info(button + " button clicked.");
            checkMessage(message);
        }

    }

    public void hoverElement(By element) {
        WebElement ele = driver.findElement(element);
        action = new Actions(driver);
        action.moveToElement(ele).build().perform();
    }

    protected WebElement getElement(By element) {
        return driver.findElement(element);
    }

    protected WebElement waitForElement(By element) {
        isElementVisible(element, 10);
        isElementClickable(element, 10);
        return wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public boolean isElementClickable(By elementInfo, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        waitClickableOfElementLocatedBy(elementInfo);
        return true;
    }

    public boolean isElementVisible(By elementInfo, int timeout) {

        WebDriverWait wait = new WebDriverWait(driver, timeout);
        waitVisibilityOfElementLocatedBy(elementInfo);
        return true;
    }

    protected void waitSeconds(int seconds) {
        try {
            logger.info("Waiting for " + seconds + " seconds.");
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
        }
    }

    protected void waitVisibilityOfElementLocatedBy(By by) {
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(by));
    }

    protected void waitClickableOfElementLocatedBy(By by) {
        wait.until(ExpectedConditions
                .elementToBeClickable(by));
    }

    protected void waitForElementAndClick(By elementInfo) {
        waitForElement(elementInfo).click();
    }

    protected void waitForElementAndClickWithAction(By elementInfo) {
        Actions action = new Actions(driver);
        action.moveToElement(waitForElement(elementInfo)).click().build().perform();

    }

    public boolean isElementDisplayed(By element) {
        return driver.findElements(element).size() > 0;
    }

    protected String waitForElementAndGetText(By elementInfo) {
        return waitForElement(elementInfo).getText();
    }

    protected void waitForElementAndSendKeys(By elementInfo, String text) {
        waitForElement(elementInfo).clear();
        waitForElement(elementInfo).sendKeys(text);
    }

}
