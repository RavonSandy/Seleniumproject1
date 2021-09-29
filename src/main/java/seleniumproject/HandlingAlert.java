package seleniumproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;

public class HandlingAlert {
	
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
        // Alert Message handling
                    		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
         	
        driver.findElement(By.name("cusid")).sendKeys("5355920");	
        takeSnapShot(driver, "C:\\Users\\santhoshg\\Documents\\MyPhoto\\test2.png") ; 
        driver.findElement(By.name("submit")).submit();			
        //this.takeSnapShot(driver, "C:\\Users\\santhoshg\\Documents\\MyPhoto\\test1.png");		
        // Switching to Alert        
       Alert alert = driver.switchTo().alert();
         
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();	
        
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
         Thread.sleep(3000);
        		
        // Accepting alert		
        alert.accept();		
        Thread.sleep(3000);
       
        takeSnapShot(driver, "C:\\Users\\santhoshg\\Documents\\MyPhoto\\test3.png") ; 
        driver.quit();
    }	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
		}
}
