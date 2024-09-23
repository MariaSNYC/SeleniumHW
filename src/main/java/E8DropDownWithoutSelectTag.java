import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E8DropDownWithoutSelectTag {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        WebElement fruitDD = driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        fruitDD.click();

        List<WebElement> allfruits = driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));

        for(WebElement fruit:allfruits){
            if(fruit.getText().equals("Mango")){
                fruit.click();
            }
        }

        WebElement favHobbiesDD = driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        favHobbiesDD.click();
        List<WebElement>allHobbies=driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
        for (WebElement hobby:allHobbies){
            if (hobby.getText().equals("Reading")){
                hobby.click();
            }
        }



    }
}
