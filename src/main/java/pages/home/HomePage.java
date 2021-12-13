package pages.home;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
private final By clickreg = (By.xpath("//input[@name='search']"));

public HomePage clickSearch(){
driver.findElement(clickreg).sendKeys("Video cards", Keys.ENTER);
    return this;
}

}
