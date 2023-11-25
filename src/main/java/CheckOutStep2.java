import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckOutStep2 extends HelperBase {
    By BTNFinish = By.xpath("//button[@id='finish']");
    By BTNCancel = By.xpath("//button[@data-test='cancel']");
    By BTNBackHome = By.xpath("//button[@data-test='back-to-products']");
    By NumberOfOrder = By.xpath("//*[@class='cart_quantity']");
    By NameOfTheItem = By.xpath("//div[@class='inventory_item_name']");

    By PriceOfTheItem = By.xpath("//div[@class='inventory_item_price']");
    By TitleCheckout = By.xpath("//span[@class='title']");
By TextThankForOrder=By.xpath("//h2[@class='complete-header']");


    public CheckOutStep2(WebDriver wd) {
        super(wd);
    }

    public void clickFinishBt() {
        click(BTNFinish);
    }   public void BackHome() {
        click(BTNBackHome);
    }

    public void clickCancelBt() {
        click(BTNCancel);
    }
public String TextAtTheEnd(){
        return wd.findElement(TextThankForOrder).getText();
}
    public boolean isNumberOfOrderCorrect(int number) {
        Integer checkNumber = Integer.parseInt(wd.findElement(NumberOfOrder).getText());

        if (number == checkNumber) return true;
        else return false;
    }

    public boolean isCorrectItem(String name) {

        if (wd.findElement(NameOfTheItem).getText().toString().trim().toUpperCase() == name.trim().toUpperCase())
            return true;
        else return false;
    }

//    public void changeNumberOfOrder(int number) {
//
//        type(NumberOfOrder,number+"");
//
//    }




}
