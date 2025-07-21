package Day4.XpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoXpath {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("Demo.html");
    }

    @Test
    public void getLabel() {
        driver.findElement(By.xpath("//input[@id='username']/preceding-sibling::label"));
    }

    @Test
    public void getInput() {
        driver.findElement(By.xpath("//label[@for='username']/following-sibling::input)")).sendKeys("Mynamehere");
    }

    @Test
    public void getParent() {
        driver.findElement(By.xpath("//input[@id='username']/parent::div"));
    }
}
