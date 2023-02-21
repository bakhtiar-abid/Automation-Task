package automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    WebDriver driver;
    public void waitTime(int time){
        try{
            Thread.sleep(time);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public void elementScroll(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
