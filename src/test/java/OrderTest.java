import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderTest extends TestBase {


    @BeforeTest
    public void CheckIsLogin() {
        if (cw.user.isElement(cw.main.MainMenu) == false) cw.login.Filllogin();
    }


    @Test
    public void PositiveOrderTest() {
        cw.main.addtoCard();
        cw.main.ClickOnBasket();
        cw.main.ClicktoCheckout();
        cw.user.filluser("Aleks", "New", "321312");
        cw.check.clickFinishBt();

        Assert.assertEquals(cw.check.TextAtTheEnd(),"Thank you for your order!","done");
        cw.check.BackHome();

    }


}
