package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.NswHomePage;

import static StepDef.Hooks.webDriver;
import static org.junit.Assert.assertEquals;


public class LocateServiceStepDef {
    @When("^User click on find location menu$")
    public void userClickOnFindLocationMenu() {
        NswHomePage nswHomePage = new NswHomePage(webDriver);
        nswHomePage.clickFindLocation();
    }

    @And("^Click on search by suburb field$")
    public void clickOnSearchBySuburbField() {
        NswHomePage nswHomePage = new NswHomePage(webDriver);
        nswHomePage.clickSearchBySuburb();
    }

    @And("^Input \"([^\"]*)\" in search box$")
    public void inputInSearchBox(String suburb) throws InterruptedException {
        NswHomePage nswHomePage = new NswHomePage(webDriver);
        nswHomePage.setSearchBySuburb(suburb);
        Thread.sleep(2000);
    }

    @And("^Press enter suburb$")
    public void pressEnterSuburb() {
        NswHomePage nswHomePage = new NswHomePage(webDriver);
        nswHomePage.pressEnter2();
    }

    @Then("^Validate user can see \"([^\"]*)\"$")
    public void validateUserCanSee(String serviceCentre){
        String pageSource = webDriver.getPageSource();

        if(pageSource.contains(serviceCentre)){
            System.out.println("String '" + serviceCentre + "' found on page");
        } else {
            System.out.println("String '" + serviceCentre + "' not found on page");
        }
    }
}
