package Activity;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndActivity {

	public static void main(String[] args) throws Exception {
		//1. Invoke Google Chrome browser/Firefox browser (any one).
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhoshg\\eclipse-workspace-learnings-selenium\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,100);
	    driver.manage().window().maximize();
	    
	    //2.	open url :   https://www.saucedemo.com/
	    driver.get("https://www.saucedemo.com/");
	    takeSnapShot(driver, "C:\\Users\\santhoshg\\Documents\\MyPhoto\\test.png") ; 
	    
	    //3.	login to website using username and password 
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#user-name"))).sendKeys("standard_user");
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name=password]"))).sendKeys("secret_sauce");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='login-button']"))).click();
        takeSnapShot(driver, "C:\\Users\\santhoshg\\Documents\\MyPhoto\\test1.png") ; 
        
        //4.	Wait until the home page gets loaded 
        //5.	Verify you are on home page : Verify the text on page " SWAG LABS" or verify the logo on home page.
        WebElement e1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='app_logo']")));
        //IsDisplayed 	
         	boolean s1= e1.isDisplayed();
         	if(s1==true) 
         	{
         		System.out.println("Assertion Passed successfully");
         	}
        //6.	Click on ADD TO CART option on any of the product.
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"))).click();
        takeSnapShot(driver, "C:\\Users\\santhoshg\\Documents\\MyPhoto\\test2.png") ; 
        
        //7.	Click on YOUR CART icon on top right corner.
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='shopping_cart_link']"))).click();
        takeSnapShot(driver, "C:\\Users\\santhoshg\\Documents\\MyPhoto\\test3.png") ; 
        
        //8.	Click on CHECKOUT
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='checkout']"))).click();
        takeSnapShot(driver, "C:\\Users\\santhoshg\\Documents\\MyPhoto\\test4.png") ; 
        
        //9.	Add details for CHECKOUT (First name, Last name, zip code)
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstName"))).sendKeys("Santhosh");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("lastName"))).sendKeys("Govindharajalu");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("postal-code"))).sendKeys("6666666");
        takeSnapShot(driver, "C:\\Users\\santhoshg\\Documents\\MyPhoto\\test5.png") ; 
        
        //10.	Scroll page down and click on CONTINUE
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,180)", "");
        
        takeSnapShot(driver, "C:\\Users\\santhoshg\\Documents\\MyPhoto\\test6.png") ; 
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='continue']"))).click();
        
        //11.	Scroll page down and Click on FINISH
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,180)", "");
        
        takeSnapShot(driver, "C:\\Users\\santhoshg\\Documents\\MyPhoto\\test7.png") ; 
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='finish']"))).click();
        takeSnapShot(driver, "C:\\Users\\santhoshg\\Documents\\MyPhoto\\test8.png") ; 
        
        //12.	Click on BACK HOME
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("back-to-products"))).click();
        takeSnapShot(driver, "C:\\Users\\santhoshg\\Documents\\MyPhoto\\test9.png") ; 
        
        //13.	LOGOUT (from Top left menu in home page)
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("react-burger-menu-btn"))).click();
        takeSnapShot(driver, "C:\\Users\\santhoshg\\Documents\\MyPhoto\\test10.png") ; 
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link"))).click();
        takeSnapShot(driver, "C:\\Users\\santhoshg\\Documents\\MyPhoto\\test11.png") ; 
        
        driver.close();
	}
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

		TakesScreenshot SS =((TakesScreenshot)webdriver);
		File SrcShotFile=SS.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(SrcShotFile, DestFile);
		}
}
		

