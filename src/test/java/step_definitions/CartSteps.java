package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.CartPage;
import org.example.pageObject.InventoryPage;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    private WebDriver webDriver;

    public CartSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("System display item list from cartpage")
    public void getItemList() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        CartPage.clickItem1();
        CartPage.clickItem2();
        Thread.sleep(2000);
    }

    @And("User click checkout button on cartpage")
    public void checkOutItem() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.checkOut();
        Thread.sleep(2000);
    }
}
