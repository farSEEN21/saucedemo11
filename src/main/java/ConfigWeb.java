import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ConfigWeb implements data {
    WebDriver wd;

    public void start() {
        wd = new FirefoxDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(33));
        wd.get("https://www.saucedemo.com/");

    }


    public void login() {
        methods meth = new methods();

        meth.type(By.xpath("//input[@id='user-name']"), login);
        meth.type(By.xpath("//input[data-test='password']"), psd);

    }
}
