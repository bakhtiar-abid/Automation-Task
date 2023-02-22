package testcases;


import pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase {

  Browser browser = new Browser();


  @Test
    public void AstrogateSignIn() throws InterruptedException {
      browser.openChromeBrowser();
      Thread.sleep(3000);
      NavigateSignInPage navigateSignInPage = new NavigateSignInPage();
      navigateSignInPage.ClickSignIn();
  }

  @Test
  public void CredentialsWithSignIn(){
    SignPage signPage = new SignPage();
    signPage.emailField().sendKeys("brainstation23@yopmail.com");
    signPage.passwordField().sendKeys("Pass@1234");
    signPage.signInButton();

  }

  @Test
  public void SelectUser(){
    UserSelection userSelection = new UserSelection();
    userSelection.selectUser();
  }

  @Test
  public void ShareBusSelect(){
    SetUpShareBus setUpShareBus = new SetUpShareBus();
    setUpShareBus.shareBusSelection();
  }

  @Test
  public void TripInformation(){
    TripDetails tripDetails = new TripDetails();
    tripDetails.ShareBusTripDetails();
  }

}
