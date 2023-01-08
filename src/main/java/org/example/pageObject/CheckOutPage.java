package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    public static WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }


    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement finalPrice;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement btnFinish;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement thxMassage;

    public String getFinalPrice() {
        return finalPrice.getText();
    }

    public void clickFinish() {
        btnFinish.click();
    }

    public boolean getTnxMassage() {
        thxMassage.isDisplayed();
        return true;
    }
}


