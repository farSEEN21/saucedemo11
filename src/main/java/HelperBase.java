import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HelperBase   {
    WebDriver wd  ;
    public HelperBase(WebDriver wd){
        this.wd=wd;
    }

    public void type(By locator, String str) {
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(str);
    }
    public void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clicks(By locator) {
        wd.findElement(locator).click();
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }


    public void login() {

        type(By.xpath("//input[@id='user-name']"), data.login_txt);
        type(By.xpath("//input[data-test='password']"), data.psd);
    }

    public WebElement WaitForElement(By locator, int time) {
        WebDriverWait wait = new WebDriverWait(wd, Duration.ofNanos(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public boolean isElementPresent(By locator) {
        if (wd.findElement(locator).isDisplayed()) {
            return true;
        } else return false;
    }

    public boolean isElementWaitHere(By locator, int time) {
        try {
            WebDriverWait wait = new WebDriverWait(wd, Duration.ofNanos(time));
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return element != null;
        } catch (NoSuchElementException | org.openqa.selenium.TimeoutException e) {
            return false;
        }
    }

public boolean isElement(By locator){
        return wd.findElements(locator).size()>0;
}


}




