package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignPage {

    WebDriver driver;

    public SignPage(WebDriver driver){
        this.driver = driver;
    }
    private By emailInputField = By.id("email");
    private By passwordInputField = By.id("password");

    private By signInButton = By.cssSelector("button[type='submit']");


    public WebElement emailField(){
        return driver.findElement(emailInputField);
    }

    public WebElement passwordField(){
        return driver.findElement(passwordInputField);
    }

    public void signInButton(){
        WebElement clickSignIn = driver.findElement(signInButton);
        clickSignIn.click();
    }
}
