package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[.='Sauce Labs Onesie']")
    private static WebElement getTextItem1;

    @FindBy(xpath = "//div[.='Sauce Labs Fleece Jacket']")
    private static WebElement getTextItem2;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkOutItem;


    public static void clickItem1() {
        String item1 = getTextItem1.getText();
        System.out.println("List product that you pick on cartpage");
        System.out.println("Product 1 :" + item1);
    }

    public static void clickItem2() {
        String item2 = getTextItem2.getText();
        System.out.println("Product 2 :" + item2);
    }

    public void checkOut() {
        checkOutItem.click();
    }

}
