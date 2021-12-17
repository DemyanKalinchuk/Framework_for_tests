package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.home.HomePage;
import pages.home.RegisterPage;
import pages.listing.RealtListingPage;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {

    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new  HomePage(driver);
    protected RegisterPage registerPage = new RegisterPage(driver);
    protected RegisterPage enterEmail = new RegisterPage(driver);
    protected RegisterPage enterPass = new RegisterPage(driver);
    protected RegisterPage enterReg = new RegisterPage(driver);
    protected RegisterPage enterRegBtn = new RegisterPage(driver);
    protected RegisterPage enterRegBtn2 = new RegisterPage(driver);
    protected RegisterPage inputName = new RegisterPage(driver);
    protected RegisterPage inputLastName = new RegisterPage(driver);
    protected RegisterPage inputPhone = new RegisterPage(driver);
    protected RegisterPage inputMail = new RegisterPage(driver);
    protected RegisterPage inputPass = new RegisterPage(driver);
    protected RealtListingPage realtListingPage = new RealtListingPage(driver);
@AfterTest
    public void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKIES_AND_STORAGE){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");

        }

    }
    @AfterSuite (alwaysRun = true)
public void close(){
    if (HOLD_BROWSER_OPEN){
        driver.quit();
    }
}

}
