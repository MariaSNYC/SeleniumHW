import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4RelativeXPath {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");

        WebElement hobbies=driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        hobbies.sendKeys("big tennis,hiking");

        WebElement clickHereButton=driver.findElement(By.xpath("//button[text()='Click Here']"));
        clickHereButton.click();

        WebElement favoriteMovie=driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
        favoriteMovie.sendKeys("Focus");

        WebElement text=driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum dolor sit')]"));
        String stringOfText=text.getText();
        System.out.println(stringOfText);

        WebElement city=driver.findElement(By.xpath("//input[@name='yourCity']"));
        city.sendKeys("New York");

        WebElement personalEmail=driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));
        personalEmail.sendKeys("falce.maria13@yahoo.com");

        WebElement officeEmail=driver.findElement(By.xpath("(//input[@class='form-control'])[5]"));
        officeEmail.sendKeys("ceeport.inc@yahoo.com");

        WebElement professionalEmail=driver.findElement(By.xpath("(//input[@class='form-control'])[6]"));
        professionalEmail.sendKeys("f.m13@yahoo.com");

        WebElement clientName=driver.findElement(By.xpath("//input[@id='clientName' and @type='text']"));
        clientName.sendKeys("Regina Filangi");

        WebElement clientId=driver.findElement(By.xpath("//input[@id='clientId' and @class='form-control']"));
        clientId.sendKeys("678678");

        WebElement streetNo=driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetNo.sendKeys("67");

        WebElement houseNo=driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNo.sendKeys("3133");









    }
}
