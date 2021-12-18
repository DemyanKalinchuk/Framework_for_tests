package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class BasketPage extends BasePage {

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    private final By enterBasket = (By.xpath("//rz-cart/button"));

    public BasketPage clickbasket() {
        driver.findElement(enterBasket).click();
        return this;
}
    private final By closeBasket = (By.xpath("//button[@class='modal__close ng-star-inserted']"));

    public BasketPage clickclosebasket() {
        driver.findElement(closeBasket).click();
        return this;

}



}

