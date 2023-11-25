import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {




    @Test
    public void correctLoginTest() {
        cw.login.Filllogin();
        cw.login.ClickMenu();
        Assert.assertEquals(cw.wd.findElement(By.xpath("//*[@id='logout_sidebar_link']")).getText(), "Logout", "Done");

    }

    @Test
    public void NegLoginWrongUserName() {
        cw.login.FillLoginFormWithWrongUser("User_user");
        Assert.assertEquals(cw.wd.findElement(By.xpath("//h3")).getText(), "Epic sadface: Username and password do not match any user in this service", "Done");
    }

    @Test
    public void NegTestLoginWithLocked() {
        cw.login.FillLoginFormWithWrongUser(1);
        Assert.assertEquals(cw.wd.findElement(By.xpath("//h3")).getText(), "Epic sadface: Sorry, this user has been locked out.", "Done");

    } //Search Google or type a URL

    @Test
    public void NegTestWrongPSW() {
        cw.login.FillLoginFormWithWrongPassword("dkfjksd");
        Assert.assertTrue(cw.login.isElement(By.xpath("//div/h3[@data-test='error']")));

    }


}
