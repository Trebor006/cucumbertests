package utilities;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DriverManager {
    private static DriverManager instance = null;

    private Page driver;

    private DriverManager() {
        Playwright playwright = Playwright.create();
        Page page = playwright.chromium().launch(getBrowserOptions()).newPage();
        page.setViewportSize(1920, 1080);
        this.driver = page;
    }

    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    public void resetContext(){
        Playwright playwright = Playwright.create();
        Page page = playwright.chromium().launch(getBrowserOptions()).newContext().newPage();
        page.setViewportSize(1920, 1080);
        this.driver = page;
    }

    private BrowserType.LaunchOptions getBrowserOptions() {
//        return new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(100);
        return new BrowserType.LaunchOptions();
    }

    public Page getDriver() {
        return driver;
    }
}
