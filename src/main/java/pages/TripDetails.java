package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TripDetails extends BasePage {

    WebDriver driver;

    public TripDetails(){
        this.driver = Browser.getDriver();
    }

    private By StartPoint = By.id("startPoint");

    private By destinationPoint = By.id("destination");

    private By departureDate = By.cssSelector("input[placeholder='Departure Date']");

    private By departureTime = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[1]/div[1]/div/div[2]/span/input");

    private By returnDate = By.cssSelector("input[placeholder='Return Date']");

    private By returnTime = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[2]/div[1]/div/div[2]/span/input");

    private By clickContinue = By.xpath("//button[@type='submit']");


    public void ShareBusTripDetails(){

        waitTime(5000);
        WebElement inputStartPoint = driver.findElement(StartPoint);
        inputStartPoint.clear();

        //Destination From
        inputStartPoint.sendKeys("Oslo");
        waitTime(3000);
        inputStartPoint.sendKeys(Keys.DOWN);
        waitTime(3000);
        inputStartPoint.sendKeys(Keys.ENTER);
        waitTime(3000);
        scrollElement(inputStartPoint);

        //Destination To
        WebElement inputDestinationPoint = driver.findElement(destinationPoint);
        inputDestinationPoint.clear();

        inputDestinationPoint.sendKeys("Kolbotn");
        waitTime(3000);
        inputDestinationPoint.sendKeys(Keys.DOWN);
        waitTime(3000);
        inputDestinationPoint.sendKeys(Keys.ENTER);
        waitTime(3000);
        scrollElement(inputDestinationPoint);

        //Departure Date & Time
        WebElement inputDepartureDate = driver.findElement(departureDate);
        inputDepartureDate.clear();
        inputDepartureDate.sendKeys("Wednesday, 22.03.2023");
        waitTime(2000);

        WebElement inputDepartureTime = driver.findElement(departureTime);
        inputDepartureTime.clear();

        scrollElement(inputDepartureTime);

        inputDepartureTime.sendKeys("06:30");
        waitTime(2000);

        //Return Date & Time
        WebElement inputReturnDate = driver.findElement(returnDate);
        inputReturnDate.clear();

        inputReturnDate.sendKeys("Friday, 31.03.2023");
        waitTime(2000);

        WebElement inputReturnTime = driver.findElement(returnTime);
        inputReturnTime.clear();

        inputReturnTime.sendKeys("06:45");
        waitTime(2000);

        scrollElement(inputReturnTime);

        //Click Submit
        WebElement submitContinue = driver.findElement(clickContinue);
        submitContinue.click();


    }

}
