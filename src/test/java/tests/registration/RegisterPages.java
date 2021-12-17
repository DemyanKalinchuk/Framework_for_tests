package tests.registration;

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
        enterRegBtn
                .clickregbtn();
        inputName
                .clickname();
        inputLastName
                .clicklastname();
        inputPhone
                .clickphone();
        inputMail
                .clickmail();
        inputPass
                .clickpass();
        enterRegBtn2
                .clickregbtn2();

    }




}

