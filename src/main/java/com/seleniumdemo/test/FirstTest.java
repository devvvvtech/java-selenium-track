package com.seleniumdemo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {
        // Set path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        System.out.println("Page Title: " + driver.getTitle());

        driver.quit();
    }
}
