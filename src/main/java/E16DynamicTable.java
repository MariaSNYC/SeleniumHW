import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E16DynamicTable {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        //select PIM option in the main menu
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        WebElement nextButton=driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
        boolean notFound=true;
        while (notFound) {
            int count = 1;
            for (WebElement id : ids) {
                String idNo = id.getText();
                if (idNo.equals("31431151")) {
                    System.out.println(count);
                    //find a checkbox and click on it
                    WebElement checkBox = driver.findElement(By.xpath("//table/tbody/tr[" + count + "]/td[1]"));
                    checkBox.click();
                    //exit while loop
                    notFound=false;
                }
                count = count + 1;
            }
            if (notFound){
                nextButton=driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                nextButton.click();
                ids=driver.findElements(By.xpath(" //table/tbody/tr/td[2]"));


            }
        }





    }
}

