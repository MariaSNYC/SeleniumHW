import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E10Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");

        WebElement birthdayReminder=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        birthdayReminder.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement deleteFile=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        deleteFile.click();
        Thread.sleep(2000);
        alert.dismiss();

        WebElement verif1=driver.findElement(By.xpath("//p[@id='confirm-demo']"));
        System.out.println(verif1.getText());


        WebElement enterYourName=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        enterYourName.click();
        Thread.sleep(2000);
        alert.sendKeys("Maria Shvets");
        alert.accept();

        WebElement verification=driver.findElement(By.xpath("//p[@id='prompt-demo']"));
        String nameText=verification.getText();
        System.out.println("Displayed name: "+nameText);
        if (nameText.equals("You have entered 'Maria Shvets' !")) {
            System.out.println("The correct name is displayed.");
        } else {
            System.out.println("The displayed name is incorrect.");
        }


    }
}
