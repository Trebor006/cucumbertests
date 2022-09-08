package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverManager;

public class Hooks {

    @Before
    public void beforeHook() {
        DriverManager.getInstance().getDriver().navigate("https://www.saucedemo.com/");
    }

    @After
    public void afterHook() {
        DriverManager.getInstance().resetContext();
    }
}
