package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class RealtListingPage extends BasePage {

    public RealtListingPage(WebDriver driver){
        super(driver);
    }
    private final By cards = By.xpath("//div[@class='catalog-grid__cell catalog-grid__cell_type_slim ng-star-inserted']");

    public RealtListingPage checkCountCards (){
        int countCards = driver.findElements(cards).size();
        Assert.assertEquals(countCards, 0);
        return this;
    }
}
