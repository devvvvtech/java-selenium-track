package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLoginDemo {
    public static void main(String[] args) {
        //set the path to chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //creating a chrome instance
        WebDriver driver = new ChromeDriver();

        //opening google
        driver.get("https://www.google.com/");

        //let's search something
        driver.findElement(By.id("APjFqb")).sendKeys("apple");
        driver.quit();
    }
}
