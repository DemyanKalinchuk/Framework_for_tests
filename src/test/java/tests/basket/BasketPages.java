package tests.basket;


import org.testng.annotations.Test;
import tests.base.BaseTest;
import static Constants.Constant.Urls.REALT_HOME_PAGE;

public class BasketPages extends BaseTest {


    @Test
    public void checkBasketPage (){

        basePage.show(REALT_HOME_PAGE);

        enterBasket
                .clickbasket();

        closeBasket
                .clickclosebasket();



    }
}
