package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    WebDriver driver;

    public BasePage(){
        this.driver = Browser.getDriver();
    }
    public void waitTime(int time){
        try{
            Thread.sleep(time);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public void scrollElement(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    }

}
