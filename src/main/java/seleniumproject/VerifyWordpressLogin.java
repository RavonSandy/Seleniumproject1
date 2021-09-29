package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 
//import seleniumproject.LoginPage;

public class VerifyWordpressLogin 
{
 

public static void main(String[] args) throws InterruptedException
{
 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\santhoshg\\eclipse-workspace-learnings-selenium\\SeleniumProject\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
 
driver.get("https://opensource-demo.orangehrmlive.com/");
 
LoginPage login=new LoginPage(driver);
login.typeUserName("Admin");
Thread.sleep(3000);
login.typePassword("admin123");
Thread.sleep(3000); 
 
login.clickOnLoginButton();
 
 
driver.quit();
 
}
 
 
;}