package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
    @Test
    public void masel() throws InterruptedException {
        
       
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("txtUsername"));
        WebElement username=driver.findElement(By.id("txtUsername"));
        driver.findElement(By.id("txtPassword"));
        WebElement password=driver.findElement(By.id("txtPassword"));
        
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        WebElement login = driver.findElement(By.id("btnLogin"));
        login.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
 