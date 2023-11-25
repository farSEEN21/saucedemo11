import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperLogin extends HelperBase {


    public HelperLogin(WebDriver wd) {
        super(wd);
    }

    public String[] GetUserName() {
        String str = wd.findElement(By.xpath("//div[@id='login_credentials']")).getText();
        String[] UserArrray = str.split("_user");
        return UserArrray;
    }

    public String GetUserName(int number) {
        String str = wd.findElement(By.xpath("//div[@id='login_credentials']")).getText();
        String[] UserArrray = str.split("_user");

        if (number > 0 || number < UserArrray.length - 1) {
            return UserArrray[number].toString();
        } else {
            return null;
        }
    }


    public void Filllogin() {
        type(By.xpath("//*[@id='user-name']"), "standard_user");
        type(By.xpath("//*[@id='password']"), "secret_sauce");
        click(By.xpath("//input[@id='login-button']"));

    }
public void FillLoginFormWithWrongPassword(String text) {
        type(By.xpath("//*[@id='user-name']"), "standard_user");
        type(By.xpath("//*[@id='password']"), text);
        click(By.xpath("//input[@id='login-button']"));

    }

    public void FillLoginFormWithWrongUser(int number) {
        type(By.xpath("//*[@id='user-name']"), GetUserName(number) + "_user");
        type(By.xpath("//*[@id='password']"), "secret_sauce");
        click(By.xpath("//input[@id='login-button']"));

    }
    public void FillLoginFormWithWrongUser(String text) {
        type(By.xpath("//*[@id='user-name']"), text);
        type(By.xpath("//*[@id='password']"), "secret_sauce");
        click(By.xpath("//input[@id='login-button']"));

    }

    public void ClickMenu() {
        click(By.xpath("//button[@id='react-burger-menu-btn']"));
    }

}
