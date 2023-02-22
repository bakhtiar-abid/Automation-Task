package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class UserSelection extends BasePage {

    WebDriver driver;

    public UserSelection(){
        this.driver = Browser.getDriver();
    }

    private By clickDropDown = By.className("p-dropdown-trigger");

    private By selectShareLead = By.cssSelector("li[aria-label='sharelead'] div span");

    private By continueButton = By.xpath("//*[text()='Continue']");


    public void selectUser(){
        waitTime(10000);
        WebElement clickOnDropDown = driver.findElement(clickDropDown);

        clickOnDropDown.click();

        WebElement clickShareLead = driver.findElement(selectShareLead);
        clickShareLead.click();

        WebElement clickContinue = driver.findElement(continueButton);
        clickContinue.click();

    }

}
