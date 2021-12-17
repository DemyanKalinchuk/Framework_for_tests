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

    private final By enterRegBtn = (By.xpath("//button[@class='auth-modal__register-link button button--link ng-star-inserted']"));


    public RegisterPage clickregbtn() {
        driver.findElement(enterRegBtn).click();
        return this;
}
    private final By inputName = (By.id("registerUserName"));

    public RegisterPage clickname() {
        driver.findElement(inputName).sendKeys("Петя");
        return this;
    }

    private final By inputLastName = (By.id("registerUserSurname"));

    public RegisterPage clicklastname() {
        driver.findElement(inputLastName).sendKeys("Четкий");
        return this;
    }
    private final By inputPhone = (By.id("registerUserPhone"));

    public RegisterPage clickphone() {
        driver.findElement(inputPhone).sendKeys("932239777");
        return this;
    }
    private final By inputMail = (By.id("registerUserEmail"));

    public RegisterPage clickmail() {
        driver.findElement(inputMail).sendKeys("demonation2222222@mail.ru");
        return this;
    }
    private final By inputPass = (By.id("registerUserPassword"));

    public RegisterPage clickpass() {
        driver.findElement(inputPass).sendKeys("qwaszxERDFCV123456");
        return this;
    }
    private final By enterRegBtn2 = (By.xpath("//button[@class='button button--large button--green auth-modal__submit']"));


    public RegisterPage clickregbtn2() {
        driver.findElement(enterRegBtn2).click();
        return this;
    }

}







