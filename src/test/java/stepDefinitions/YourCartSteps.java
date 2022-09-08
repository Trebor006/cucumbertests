package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.YourCartPage;
import utilities.DriverManager;

public class YourCartSteps {
    YourCartPage yourCartPage = new YourCartPage(DriverManager.getInstance().getDriver());

    @And("I click on checkout button")
    public void clickOnCheckoutButton() {
        yourCartPage.clickOnCheckoutButton();
    }

    @Then("verify all remove buttons are displayed")
    public void verifyAllRemoveButtonsAreDisplayed() {
        yourCartPage.verifyIfRemoveButtonsAreDisplayed();
    }

    @Then("verify all remove buttons are displayed just two selected options")
    public void verifyAllRemoveButtonsAreDisplayedJustTwoSelectedOptions() {
        yourCartPage.verifyIfRemoveButtonsAreDisplayedJustTwoSelectedOptions();
    }

    @And("I click on continue shopping button")
    public void iClickOnContinueShoppingButton() {
        yourCartPage.clickOnContinueShoppingButton();
    }

    @And("I click on remove AllTheThing TShirt button from YourCart")
    public void iClickOnRemoveAllTheThingTShirtButtonFromYourCart() {
        yourCartPage.clickOnRemoveAllTheThingTShirtButtonFromYourCart();
    }
}
