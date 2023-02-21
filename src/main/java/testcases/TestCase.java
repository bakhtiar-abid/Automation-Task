package testcases;


import pages.NavigateSignInPage;
import pages.SignPage;
import io.github.bonigarcia.wdm.WebDriverManager;
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
      NavigateSignInPage navigateSignInPage = new NavigateSignInPage(driver);
      navigateSignInPage.ClickSignIn();
  }

  @Test
  public void SignInWithCredentials(){
    SignPage signPage = new SignPage(driver);
    signPage.emailField().sendKeys("brainstation23@yopmail.com");
    signPage.passwordField().sendKeys("Pass@1234");
    signPage.signInButton();

  }


}
