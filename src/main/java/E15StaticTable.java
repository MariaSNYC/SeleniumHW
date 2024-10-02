import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E15StaticTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");

        List<WebElement>allCountries=driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
        int count=1;
        for (WebElement country:allCountries) {
            String USA = country.getText();
            if (USA.equals("USA")) {

                WebElement rows=driver.findElement(By.xpath("//table/tbody/tr["+count+"]"));
                System.out.println(rows.getText());
            }
            count++;
        }

    }
}
