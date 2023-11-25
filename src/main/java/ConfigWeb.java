import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ConfigWeb implements data {
    WebDriver wd;
    HelperLogin login;
    HelperUser user;
    HelperMain main;
   CheckOutStep2 check;

    public HelperLogin getLogin() {
        return login;
    }

    public HelperUser getUser() {
        return user;
    }

    public HelperMain getMain() {
        return main;
    }


    public void init() {
        wd = new FirefoxDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        wd.get("https://www.saucedemo.com/");
        user = new HelperUser(wd);
        login = new HelperLogin(wd);
        main = new HelperMain(wd);
         check=new CheckOutStep2(wd);
    }


    public void teardown() {
        wd.quit();
    }

}
