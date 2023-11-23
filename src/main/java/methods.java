import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class methods extends ConfigWeb {
    public void type(By locator, String str) {
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(str);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

}
