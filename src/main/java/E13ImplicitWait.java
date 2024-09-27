import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class E13ImplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement B1=driver.findElement(By.xpath("//button[@id='show_text_synchronize_three']"));
        B1.click();
        WebElement CheckBox= driver.findElement(By.xpath("//input[@value='Option-1']"));
        CheckBox.click();

    }
}
