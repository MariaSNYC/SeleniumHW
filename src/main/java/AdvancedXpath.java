import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("  https://syntaxprojects.com/advanceXpath-homework.php");

        WebElement leastFav=driver.findElement(By.xpath("//div[@class='row col-4-fields']/child::input[3]"));
        leastFav.sendKeys("The soldier of light");

        WebElement secondFav=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        secondFav.sendKeys("Harry Potter");

        WebElement Fav=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        Fav.sendKeys("Radical Forgiveness");

        WebElement ourFav=driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        ourFav.sendKeys("Radical Forgiveness");

        WebElement secFav=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        secFav.sendKeys("Harry Potter");

        WebElement ourLeastFav=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        ourLeastFav.sendKeys("The soldier of light");

        WebElement grandparent=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandparent.sendKeys("Vladimir");

        WebElement parent=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("Sergii");

        WebElement child=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("Maria");





    }
}
