package StepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.NswHomePage;

import static StepDef.Hooks.webDriver;

public class SearchStepDef {
    @Given("^Open service\\.nsw homepage$")
    public void userOnServiceNswWebsite() {
        NswHomePage nswHomePage = new NswHomePage(webDriver);
        nswHomePage.isDisplayed();
    }

    @When("^User click search field$")
    public void userClickSearchField() {
        NswHomePage nswHomePage = new NswHomePage(webDriver);
        nswHomePage.clickSearch();
    }

    @And("^Input text \"([^\"]*)\"$")
    public void input(String text) throws InterruptedException {
        NswHomePage nswHomePage = new NswHomePage(webDriver);
        nswHomePage.setSearchField(text);
        Thread.sleep(2000);
    }

    @And("^Press enter search$")
    public void pressEnterSearch() {
        NswHomePage nswHomePage = new NswHomePage(webDriver);
        nswHomePage.pressEnter1();
    }

    @Then("^Validate the navigation to appropriate page$")
    public void validateTheNavigationToAppropriatePage() {
        String expectedUrl = "https://www.service.nsw.gov.au/search-results?q=Apply%20for%20a%20number%20plate";
        String actualUrl = webDriver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Successful navigate to appropriate page");
        } else {
            System.out.println("Failed navigate to appropriate page");
        }
        webDriver.quit();
    }
}
