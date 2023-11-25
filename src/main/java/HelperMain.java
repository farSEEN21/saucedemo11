import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperMain extends HelperBase {


    By MainMenu = By.xpath("//button[@id='react-burger-menu-btn']");
    By BasketCart = By.xpath("//a[@class='shopping_cart_link']");
    By AddToCartToBackPack = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By ButtonAddToCart = By.xpath("//div/button[.='Add to cart']");
    By ButtonRemoveToCart = By.xpath("//div/button[.='Remove']");
    By ButtonToCheckout =  (By.xpath("//button[@id='checkout']"));

    public HelperMain(WebDriver wd) {
        super(wd);
    }


    public void addtoCard() {
        click(ButtonAddToCart);
    }

    public void AddtoBackPack() {
        click(AddToCartToBackPack);
    }

    public void ClickOnBasket() {
        click(BasketCart);
    }

    public void ClickToRemove() {
        click(ButtonRemoveToCart);
    }
    public void ClickOnMenu(){
        click(MainMenu);
    }
public void ClicktoCheckout(){click(ButtonToCheckout);}



}
