import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E17NavigationalCalendar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");

        driver.findElement(By.xpath("//input[@id='from_date']")).click();

        WebElement month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        String currentMonth=month.getText();
        WebElement nextBtn= driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
        boolean notMonth=true;

        while (notMonth){

            if (currentMonth.equals("October 2024")) {
                List<WebElement> dates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for (WebElement date : dates) {
                    String currentDate = date.getText();
                    if (currentDate.equals("1")) {
                        date.click();


                    }
                }
                notMonth=false;

            }else{
                nextBtn= driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
                nextBtn.click();
                currentMonth=month.getText();


            }
        }




    }
}
