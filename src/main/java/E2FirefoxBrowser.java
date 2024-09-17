import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E2FirefoxBrowser {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();

        driver.get("https://www.syntaxprojects.com/");
        driver.manage().window().maximize();
        String currentURL=driver.getCurrentUrl();
        System.out.println("The current URL is :"+currentURL);
        String title=driver.getTitle();
        System.out.println("The title is: "+title);
        driver.close(); 

    }
}
