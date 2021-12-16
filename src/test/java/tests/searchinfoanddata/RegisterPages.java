package tests.searchinfoanddata;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static Constants.Constant.Urls.REALT_HOME_PAGE;

public class RegisterPages extends BaseTest {

    @Test
    public void checkRegisterPage (){

        basePage.show(REALT_HOME_PAGE);

        registerPage
                .clickreg();
        enterEmail
                .clickEmail();
        enterPass
                .clickPass();
        enterReg
                .clickAutor();
    }




}

