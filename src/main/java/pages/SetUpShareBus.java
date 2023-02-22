package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SetUpShareBus extends BasePage{

    WebDriver driver;

    public SetUpShareBus(){
        this.driver = Browser.getDriver();
    }




    private By selectShareBus = By.xpath("//*[text()='Set up a Sharebus']");


    public void shareBusSelection(){
        waitTime(10000);
        WebElement clickShareBus = driver.findElement(selectShareBus);

        scrollElement(clickShareBus);
        waitTime(3000);

        clickShareBus.click();
        waitTime(3000);
    }
}
