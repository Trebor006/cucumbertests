package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import utilities.DriverManager;

public class HomeSteps {
    private HomePage homePage = new HomePage(DriverManager.getInstance().getDriver());

    @Then("I am in the home page")
    @Then("I should be in the home page")
    public void verifyImInHomePage() {
        homePage.verifyHomePageHeaderIsDisplayed();
    }

    @Then("I verify that {string} is displayed")
    public void verifyProductInHomePage(String product) {
        homePage.verifyProductInHomePage(product);
    }

    @Then("I add sauce labs back pack product to the cart")
    public void addSauceLabsBackPackToCart() {
        homePage.clickOnAddSauceLabsBackPack();
    }

    @And("I click on the cart icon")
    public void clickOnCartIcon() {
        homePage.clickOnCartIcon();
    }

    @And("I add sauce labs bike-light product to the cart")
    public void iAddSauceLabsBikeLightProductToTheCart() {
        homePage.clickOnAddSauceLabsBikeLightProduct();
    }

    @And("I add allthethings T-shirt red product to the cart")
    public void iAddAllthethingsTShirtRedProductToTheCart() {
        homePage.clickOnAddAllthethingsTShirtRed();
    }

    @And("I click on remove AllTheThing TShirt button")
    public void iClickOnRemoveAllTheThingTShirtButton() {
        homePage.clickOnRemoveAllTheThingTShirtButton();
    }

    @Then("verify add AllTheThing TShirt button is visible")
    public void verifyAddAllTheThingTShirtButtonIsVisible() {
        homePage.verifyAddAllTheThingTShirtButtonIsVisible();
    }
}
