import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class E14ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");

        WebElement B1 = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        B1.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"), "Ssyntaxtechs"));
        WebElement text = driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(text.getText());

        WebElement B2 = driver.findElement(By.xpath("//button[@id='enable_button']"));
        B2.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
        WebElement clickableButton = driver.findElement(By.xpath("//button[text()='Button']"));
        clickableButton.click();

        WebElement B3 = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        B3.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='checkbox']")));
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkbox']"));

        checkBox.click();

        if (checkBox.isSelected()) {
            System.out.println("CheckBox is selected");
        } else {
            System.out.println("CheckBox is not selected");
        }
    }
}