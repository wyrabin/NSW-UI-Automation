package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.CheckOutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckOutSteps {
    private WebDriver webDriver;

    public CheckOutSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("Verify total price is \"(.*)\"")
    public void verifyTotalPrice(String finalPrice) throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertEquals(finalPrice, checkOutPage.getFinalPrice());
        Thread.sleep(2000);

    }

    @And("^User click finish button to checkout$")
    public void clickBtnFinish() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.clickFinish();
        Thread.sleep(2000);

    }

    @And("^Display massage THANK YOU FOR YOUR ORDER$")
    public void thanksMsg() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.getTnxMassage();
        Thread.sleep(2000);
    }
}
