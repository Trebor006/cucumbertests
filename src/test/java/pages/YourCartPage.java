package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class YourCartPage {
    private Page driver;
    private Locator checkoutButton;
    private Locator removeFromCartSauceLabsBackpackButton;
    private Locator removeFromCartSauceLabsBikeLightButton;
    private Locator removeFromCartTestAllthethingsTShirtRedButton;
    private Locator continueShoppingButton;

    public YourCartPage(Page driver) {
        this.driver = driver;
        this.checkoutButton = driver.locator("id=checkout");

        this.continueShoppingButton = driver.locator("#continue-shopping");
        this.removeFromCartSauceLabsBackpackButton = driver.locator("id=remove-sauce-labs-backpack");
        this.removeFromCartSauceLabsBikeLightButton = driver.locator("id=remove-sauce-labs-bike-light");
        this.removeFromCartTestAllthethingsTShirtRedButton = driver.locator("id=remove-test.allthethings()-t-shirt-(red)");
    }

    public void clickOnCheckoutButton() {
        checkoutButton.click();
    }

    public boolean removeFromCartSauceLabsBackpackDisplayed() {
        return removeFromCartSauceLabsBackpackButton.isVisible();
    }

    public boolean removeFromCartSauceLabsBikeLightIsDisplayed() {
        return removeFromCartSauceLabsBikeLightButton.isVisible();
    }

    public boolean removeFromCartTestAllthethingsTShirtRedIsDisplayed() {
        return removeFromCartTestAllthethingsTShirtRedButton.isVisible();
    }

    public void verifyIfRemoveButtonsAreDisplayed(){
        Assert.assertTrue(removeFromCartSauceLabsBackpackDisplayed());
        Assert.assertTrue(removeFromCartSauceLabsBikeLightIsDisplayed());
        Assert.assertTrue(removeFromCartTestAllthethingsTShirtRedIsDisplayed());
    }

    public void verifyIfRemoveButtonsAreDisplayedJustTwoSelectedOptions(){
        Assert.assertTrue(removeFromCartSauceLabsBackpackDisplayed());
        Assert.assertTrue(removeFromCartSauceLabsBikeLightIsDisplayed());
        Assert.assertFalse(removeFromCartTestAllthethingsTShirtRedIsDisplayed());
    }

    public void clickOnContinueShoppingButton() {
        continueShoppingButton.click();
    }

    public void clickOnRemoveAllTheThingTShirtButtonFromYourCart() {
        removeFromCartTestAllthethingsTShirtRedButton.click();
    }
}
