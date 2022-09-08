package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class HomePage {
    private Page driver;
    private Locator header;
    private Locator sauceLabsBackPackAddButton;
    private Locator cartIcon;
    private Locator addSauceLabsBikeLightAddButton;
    private Locator addAllTheThingTShirtRedButton;
    private Locator removeAllTheThingTShirtRedButton;

    public HomePage(Page driver) {
        this.driver = driver;
        this.header = driver.locator("div.header_label");
        this.sauceLabsBackPackAddButton = driver.locator("id=add-to-cart-sauce-labs-backpack");
        cartIcon = driver.locator("a.shopping_cart_link");
        this.addSauceLabsBikeLightAddButton = driver.locator("id=add-to-cart-sauce-labs-bike-light");
        this.addAllTheThingTShirtRedButton = driver.locator("id=add-to-cart-test.allthethings()-t-shirt-(red)");
        this.removeAllTheThingTShirtRedButton = driver.locator("id=remove-test.allthethings()-t-shirt-(red)");
    }

    public void verifyHomePageHeaderIsDisplayed() {
        Assert.assertTrue(header.isVisible());
    }

    public void verifyProductInHomePage(String product) {
        Assert.assertTrue(driver.isVisible("//div[text()='" + product + "']"));
    }

    public void clickOnAddSauceLabsBackPack() {
        sauceLabsBackPackAddButton.click();
    }

    public void clickOnCartIcon() {
        cartIcon.click();
    }

    public void clickOnAddSauceLabsBikeLightProduct() {
        addSauceLabsBikeLightAddButton.click();
    }

    public void clickOnAddAllthethingsTShirtRed() {
        addAllTheThingTShirtRedButton.click();
    }

    public void clickOnRemoveAllTheThingTShirtButton() {
        removeAllTheThingTShirtRedButton.click();
    }

    public void verifyAddAllTheThingTShirtButtonIsVisible() {
        Assert.assertTrue(addAllTheThingTShirtRedButton.isVisible());
    }
}
