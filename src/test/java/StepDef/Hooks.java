package StepDef;

import cucumber.api.java.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver webDriver;

    @Before
    public void openBrowser() throws InterruptedException {
        // Set the system property to use ChromeDriver
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        webDriver = new ChromeDriver();

        webDriver.get("https://www.service.nsw.gov.au/");

        // Set windows size after Chrome was opened
        webDriver.manage().window().maximize();

    }

    @After
    public void closeBrowser() {
        webDriver.quit();
    }

}


