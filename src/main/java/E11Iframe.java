import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E11Iframe {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");

        driver.switchTo().frame(1);
        WebElement nestedFrame=driver.findElement(By.xpath("//iframe[@name='checkbox-iframe']"));

        driver.switchTo().frame(nestedFrame);

        WebElement AgeCB=driver.findElement(By.xpath("//input[@value='Option-1']"));
        AgeCB.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdown-iframe");

        WebElement DD=driver.findElement(By.xpath("//select[@id='cities']"));
        Select sel=new Select(DD);
        sel.selectByVisibleText("Dallas");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement name=driver.findElement(By.xpath("//input[@name='Username']"));
        name.sendKeys("Maria Shvets");











    }
}
