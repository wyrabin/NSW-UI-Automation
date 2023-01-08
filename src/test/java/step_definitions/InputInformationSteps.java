package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import org.example.pageObject.InformationPage;
import org.example.pageObject.LoginPage;
import org.openqa.selenium.WebDriver;

public class InputInformationSteps {
    private final WebDriver webDriver;

    public InputInformationSteps() {
        super();
        this.webDriver = Hooks.webDriver;

    }

    @When("^User input \"([^\"]*)\" as firstName and input \"([^\"]*)\" as lastName and input \"([^\"]*)\" as postalCode$")
    public void inputInformation(String firstName, String lastName, String postalCode) throws InterruptedException {
        InformationPage informationPage = new InformationPage(webDriver);
        informationPage.SetFirstName(firstName);
        informationPage.SetLastName(lastName);
        informationPage.SetPostalCode(postalCode);
        informationPage.BtnContinue();

        Thread.sleep(3000);
    }
}
