package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectors {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.findElement(By.cssSelector("input[placeholder='password']"));
        driver.findElement(By.cssSelector("button#login-button"));
        driver.findElement(By.cssSelector("input[name$='name']"));
    }
}
