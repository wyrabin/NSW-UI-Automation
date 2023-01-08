package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.InventoryPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps {
    private WebDriver webDriver;

    public PurchaseSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User sort product list by name z to a")
    public void selectProductContainer() throws InterruptedException {
        InventoryPage inventoriPage = new InventoryPage(webDriver);
        String a = "Name (Z to A)";
        inventoriPage.selectProductContainer(a);
        Thread.sleep(2000);
    }

    @And("User pick item Sauce Labs Backpack")
    public void clickItemBasket1() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickBasket1();
        Thread.sleep(2000);
    }

    @And("User pick item sauce labs fleece jacket")
    public void clickItemBasket2() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickBasket2();
        Thread.sleep(2000);
    }

    @And("User click total item on basket")
    public void clickTotalBasket() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickBasket();
        Thread.sleep(2000);
    }

    @Then("User already on landing page")
    public void verifyLandingPage() {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Assert.assertTrue(inventoryPage.displayLandingPage());
    }


}
