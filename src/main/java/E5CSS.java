import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E5CSS {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        WebElement userID=driver.findElement(By.cssSelector("input#UserID"));
        userID.sendKeys("567567");

        WebElement userName=driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys("Maria Shvets");

        WebElement introToLecture=driver.findElement(By.cssSelector("input[data-starts*='introCSSAdv']"));
        introToLecture.sendKeys("Hello, dear friends");

        WebElement feedbackFromRay=driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackFromRay.sendKeys("Good job");

        WebElement feedbackFromDucky=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackFromDucky.sendKeys("Loved the lecture!");

        WebElement clientId=driver.findElement(By.cssSelector("input[data-ends*='CSSModule']"));
        clientId.sendKeys("123456");

        WebElement email=driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("gdd12@gmail.com");

        WebElement courseTopic=driver.findElement(By.cssSelector("input[data-content$='intermediate topic']"));
        courseTopic.sendKeys("CSS");








    }
}
