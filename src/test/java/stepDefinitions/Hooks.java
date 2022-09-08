package stepDefinitions;

import com.microsoft.playwright.Page;
import io.cucumber.java.Before;
import utilities.DriverManager;

public class Hooks {

    @Before
    public void beforeHook() {
        Page driver = DriverManager.getInstance().resetContext();
        driver.navigate("https://www.saucedemo.com/");
    }
}
