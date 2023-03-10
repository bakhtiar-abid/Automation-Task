package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigateSignInPage extends BasePage {
    WebDriver driver;

    public NavigateSignInPage(){
        this.driver = Browser.getDriver();
    }

   private By signInButton = By.xpath("//*[text()='Sign in ']");

    public void ClickSignIn(){driver.get("https://test.sharebus.co/");
       WebElement signInButtton = driver.findElement(signInButton);
       signInButtton.click();
       waitTime(3000);
    }


}
