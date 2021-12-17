package tests.seach_function;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static Constants.Constant.Urls.REALT_HOME_PAGE;

public class SearchSomeProductTest extends BaseTest {
    @Test
    public void checkRedirectToListing (){

        basePage.show(REALT_HOME_PAGE);
        homePage
                .clickSearch();

        realtListingPage.checkCountCards();
    }



}
