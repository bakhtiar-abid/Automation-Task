package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage {
    WebDriver driver;

    public SignInPage(WebDriver driver){
        this.driver = driver;
    }

   private By signInButton = By.xpath("//*[text()='Sign in ']");

    public void NavigateToSignPage(){
       WebElement signInButtton = driver.findElement(signInButton);
       signInButtton.click();
       waitTime(3000);
    }


}
