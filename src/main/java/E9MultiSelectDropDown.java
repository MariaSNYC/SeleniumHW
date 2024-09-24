import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class E9MultiSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");

        WebElement favFruit = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));

        Select sel=new Select(favFruit);
        sel.selectByVisibleText("Pear");
        Thread.sleep(2000);

        List<WebElement> allOptions = sel.getOptions();
        System.out.println("Available options in the dropdown:");
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }

        WebElement mutliSelect = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select selectMulitple =new Select(mutliSelect);
        System.out.println(selectMulitple.isMultiple());


        selectMulitple.selectByIndex(1);
        selectMulitple.selectByVisibleText("Cooking");
        selectMulitple.selectByValue("Gardening");
        Thread.sleep(2000);

        List<WebElement>allselected=selectMulitple.getAllSelectedOptions();
        System.out.println("Available options in the dropdown:");
        for (WebElement each:allselected){
            System.out.println(each.getText());
        }
        Thread.sleep(5000);
        selectMulitple.deselectByIndex(1);
        List<WebElement>allselected1=selectMulitple.getAllSelectedOptions();
        System.out.println("Available options in the dropdown:");
        for (WebElement each:allselected1){
            System.out.println(each.getText());
        }









    }

}
