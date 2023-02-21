package testcase;


import automation.SignInPage;
import automation.VerifySignIn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase {


  WebDriver driver;

  @Test
    public void NavigateSignIn() throws InterruptedException {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
      driver.get("https://test.sharebus.co/");

      Thread.sleep(3000);
      SignInPage signInPage = new SignInPage(driver);
      signInPage.NavigateToSignPage();
  }

  @Test
  public void VerifySignInWithCredentials(){
    VerifySignIn verifySignIn = new VerifySignIn(driver);
    verifySignIn.emailField().sendKeys("brainstation23@yopmail.com");
    verifySignIn.passwordField().sendKeys("Pass@1234");
    verifySignIn.signInButton().click();

  }


}
