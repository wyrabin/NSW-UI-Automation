package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {
    public static WebDriver driver;

    public InventoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectContainer;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement basketItem1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    private WebElement basketItem2;

    @FindBy(xpath = "//a[.='2']")
    private WebElement totalBasket;

    @FindBy(xpath = "//span[@class='']")
    private WebElement displayLandingPage;

    public void clickBasket1() {
        basketItem1.click();
    }

    public void clickBasket2() {
        basketItem2.click();
    }

    public void clickBasket() {
        totalBasket.click();
    }

    public void selectProductContainer(String sortProductList) {
        Select b = new Select(selectContainer);
        b.selectByVisibleText(sortProductList);
    }

    public boolean displayLandingPage() {
        return displayLandingPage.isDisplayed();
    }


}
