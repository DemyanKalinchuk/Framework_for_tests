package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class SearchFunction extends BasePage {

    public SearchFunction(WebDriver driver) {
        super(driver);
    }
private final By clickserch = (By.xpath("//input[@name='search']"));

public SearchFunction clickSearch(){
driver.findElement(clickserch).sendKeys("Video cards", Keys.ENTER);
    return this;
}

}
