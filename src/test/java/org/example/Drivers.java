package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {

    public static void main(String[] args) {
        Drivers drivers = new Drivers();
        drivers.initiateChrome();
        drivers.initiateFirefox();
    }

    public void initiateChrome(){
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com/");
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.name("q")).sendKeys("eenadu");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        driver.quit();
    }

    public void initiateFirefox(){
//        ChromeOptions options = new ChromeOptions();
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com/");
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.name("q")).sendKeys("eenadu");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        driver.quit();

    }


}
