package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationPage {
    public static WebDriver driver;

    public InformationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement btnContinue;

    public void SetFirstName(String fname) {
        firstName.sendKeys(fname);
    }

    public void SetLastName(String lname) {
        lastName.sendKeys(lname);
    }

    public void SetPostalCode(String pcode) {
        postalCode.sendKeys(pcode);
    }

    public void BtnContinue() {
        btnContinue.click();
    }

}
