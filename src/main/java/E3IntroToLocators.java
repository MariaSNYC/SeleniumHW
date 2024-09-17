import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3IntroToLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        WebElement fullName=driver.findElement(By.name("FullName"));
        fullName.sendKeys("Maria Shvets");

        WebElement email=driver.findElement(By.id("yourEmail"));
        email.sendKeys("shvets.maria13gmail.com");

        WebElement clientName=driver.findElement(By.name("ClientName"));
        clientName.sendKeys("Maria");

        WebElement clientID=driver.findElement(By.id("ClientId"));
        clientID.sendKeys("4569870");


        WebElement clientFeedback=driver.findElement(By.name("Clientfeedback"));
        clientFeedback.sendKeys("Learning Selenium is fun and very interesting");

        WebElement projectName=driver.findElement(By.id("ProjectNameId"));
        projectName.sendKeys("Intro to locators(Selenium)");

        WebElement projectsDeadlineTime=driver.findElement(By.name("ProjectTime"));
        projectsDeadlineTime.sendKeys("September 22,2024");

        WebElement currentAddress=driver.findElement(By.id("CurrentAddressId"));
        currentAddress.sendKeys("466 East 23rd street, apt 67K,New York,NY, 10002");

        WebElement permanentAddress=driver.findElement(By.name("PermanentAddress"));
        permanentAddress.sendKeys("466 East 23rd street, apt 67K,New York,NY, 10002");
        Thread.sleep(2000);
        WebElement submitButton = driver.findElement(By.id("btn-submit"));

        submitButton.click();
        Thread.sleep(2000);
        WebElement clickHere = driver.findElement(By.linkText("Click Here."));
        clickHere.click();
        Thread.sleep(2000);


        



    }
}
