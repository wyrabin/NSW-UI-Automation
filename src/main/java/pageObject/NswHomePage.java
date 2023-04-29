package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NswHomePage {

    public static WebDriver driver;

    public NswHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    //Task 1
    @FindBy(xpath = "//h1[.='Service NSW makes it easier to find government information and services']")
    private WebElement titleSearch;

    @FindBy(tagName = "input") // I use findbytagname because the xpath changes every hour. maybe this site uses ajax

    private WebElement searchField;

    //Task 2
    @FindBy(xpath = "//a[.='Find locations']")
    private WebElement findLocation;

    @FindBy(xpath = "//*[@id=\"locatorTextSearch\"]")
    private WebElement searchBySuburbField;

    public void clickSearch() {
        searchField.click();
    }

    public void setSearchField(String text) {
        searchField.sendKeys(text);
    }

    public void pressEnter1() {
        searchField.sendKeys(Keys.ENTER);
    }

    public void clickFindLocation() {
        findLocation.click();
    }

    public void clickSearchBySuburb() {
        searchBySuburbField.click();
    }

    public void setSearchBySuburb(String suburb) {
        searchBySuburbField.sendKeys(suburb);
    }

    public void pressEnter2() {
        searchBySuburbField.sendKeys(Keys.ENTER);
    }

    public boolean isDisplayed() {
        titleSearch.isDisplayed();
        return true;
    }
}
