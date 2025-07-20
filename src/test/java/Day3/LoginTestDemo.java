package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //creating instance of chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        //creating locators
        driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
//        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.findElement(By.xpath("//input[contains(@class, 'submit-button')]")).click();
    }
}
