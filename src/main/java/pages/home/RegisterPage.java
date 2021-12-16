package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    private final By clickreg = (By.xpath("//rz-user/button"));


    public RegisterPage clickreg() {
        driver.findElement(clickreg).click();
        return this;
    }


    private final By enterEmail = (By.id("auth_email"));

    public RegisterPage clickEmail() {
        driver.findElement(enterEmail).sendKeys("demonation20@gmail.com", Keys.TAB);
        return this;
    }

    private final By enterPass = (By.id("auth_pass"));

    public RegisterPage clickPass() {
        driver.findElement(enterPass).sendKeys("QWASZXerdfcv12345");
        return this;
    }


    private final By enterReg = (By.xpath("//button[@class='button button--large button--green auth-modal__submit ng-star-inserted']"));

    public RegisterPage clickAutor() {
        driver.findElement(enterReg).click();
        return this;
    }

}




