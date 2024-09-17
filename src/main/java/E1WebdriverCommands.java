import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1WebdriverCommands {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        String title1 =driver.getTitle();
        System.out.println("the title1 of the website1 is : "+title1);
        driver.navigate().to("https://www.syntaxprojects.com/");
        String title2=driver.getTitle();
        System.out.println("the title2 of the website2 is : "+title2);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();




    }
}
