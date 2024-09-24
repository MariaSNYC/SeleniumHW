import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class E12WindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");

        String mainPageWindowHandle=driver.getWindowHandle();
        System.out.println("The window handle of the main page is: "+mainPageWindowHandle);

        WebElement B1Button=driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        B1Button.click();

        Set<String> allHandles=driver.getWindowHandles();
        for (String handle:allHandles){
            driver.switchTo().window(handle);
            String URL=driver.getCurrentUrl();
            if (URL.equals("https://syntaxprojects.com/b1-page.php")){
                //find the text box and send some keys
                WebElement Box=driver.findElement(By.xpath("//h2[text()='Welcome to B! page']"));
                if (Box.getText().equals("Welcome to B1 page")){
                    System.out.println("The text in the window opened matched Welcome to B1 page");
                }else {
                    System.out.println("The text in the window opened does not match Welcome to B1 page. Bug found");
                }

                break;
            }
        }
        driver.switchTo().window(mainPageWindowHandle);

        WebElement B2Button=driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));
        B2Button.click();

        Set<String> allOtherHandles=driver.getWindowHandles();
        for (String handle1:allOtherHandles){
            driver.switchTo().window(handle1);
            String URL=driver.getCurrentUrl();
            if (URL.equals("https://syntaxprojects.com/b2-page.php")){
                //find the text box and send some keys
                WebElement Box=driver.findElement(By.xpath("//h2[text()='Welcome to B2 page']"));
                if (Box.getText().equals("Welcome to B2 page")){
                    System.out.println("The text in the window opened matched Welcome to B2 page");
                }else {
                    System.out.println("The text in the window opened does not match Welcome to B2 page. Bug found");
                }

                break;
            }
        }







    }
}
