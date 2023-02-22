package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MembershipInfo extends BasePage {


    WebDriver driver;

    public MembershipInfo(){
        this.driver = Browser.getDriver();
    }

    private By selectYes = By.xpath("//*[contains(@class,'text-start')]/*[text()='Yes']");

    private By selectDropDown = By.xpath("//i[@class='fi fi-chevron-down']");

    private By selectNtnui = By.xpath("//li[normalize-space()='NTNUI']");

    private By submitButton = By.xpath("//button[@type='submit']");

    private By needTicket = By.xpath("//*[text()='Need tickets for yourself?']/following-sibling::div/*[text()='No']");

    private  By activeDiscount = By.xpath("//*[text()='Activate ticket discounts?']/following-sibling::div/*[text()='No']");

    private By creatingShareBus = By.xpath("//*[text()='Create Sharebus']");

    private By publish = By.xpath("//*[text()='Publish']");

    private By TripSelect = By.cssSelector(".form-control.rounded.is-invalid");

    private By selectCategory =By.xpath("//*[text()='Sport']");

    private By selectPreview =By.xpath("//*[text()='Preview and publish']");
    private By selectMyBus =By.xpath("//*[text()='My busses']");
    private By selectMyTour =By.xpath("//*[text()='Tour']");





    public void MemberShipDetails(){



        WebElement clickYes = driver.findElement(selectYes);
        clickYes.click();
        waitTime(3000);

        WebElement clickDropDown = driver.findElement(selectDropDown);
        clickDropDown.click();

        WebElement clickOption = driver.findElement(selectNtnui);
        clickOption.click();
        waitTime(2000);

        WebElement clickContinue = driver.findElement(submitButton);
        clickContinue.click();

        WebElement clickNeedTicket = driver.findElement(needTicket);
        clickNeedTicket.click();

        scrollElement(clickNeedTicket);

        WebElement activeDiscounts = driver.findElement(activeDiscount);
        activeDiscounts.click();

        scrollElement(activeDiscounts);

        WebElement clickShareBus = driver.findElement(creatingShareBus);
        clickShareBus.click();
        waitTime(3000);

        WebElement clickPublish = driver.findElement(publish);
        clickPublish.click();

        WebElement inputTripName = driver.findElement(TripSelect);
        inputTripName.sendKeys("Outing");
        waitTime(3000);

        WebElement categorySelect = driver.findElement(selectCategory);
        categorySelect.click();
        waitTime(3000);

        scrollElement(categorySelect);

        WebElement previewAndPublish = driver.findElement(selectPreview);
        previewAndPublish.click();
        waitTime(4000);


        WebElement finalPublish = driver.findElement(publish);
        finalPublish.click();
        waitTime(4000);

        WebElement clickOnMyBus = driver.findElement(selectMyBus);
        clickOnMyBus.click();
        waitTime(4000);


        WebElement tourSelect = driver.findElement(selectMyTour);
        scrollElement(tourSelect);
        if(tourSelect.isDisplayed()){
            System.out.println("My Trip is displayed");
        }else {
            System.out.println("My Trip is not displayed");
        }

        waitTime(3000);




    }


}
