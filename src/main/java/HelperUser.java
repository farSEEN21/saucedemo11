
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HelperUser extends HelperBase {

By Name=By.xpath("//input[@id='first-name']");
By LastName=By.xpath("//input[@id='last-name']");
By ZipCode=By.xpath("//input[@id='postal-code']");
By BTNContinu=By.xpath("//input[@id='continue']");


    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void filluser(String name,String lastname,String zip){
        User user=User.builder().Name(name).Lastname(lastname).ZipCod(zip).build();
        type(Name, user.getName());
        type(LastName, user.getLastname());
        type(ZipCode, user.getZipCod());
        click(BTNContinu);
    }



}
