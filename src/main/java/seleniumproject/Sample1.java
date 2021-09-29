package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Sample1 {
@Test
	public void mavsel1() throws Exception{
		
		String baseurl = "http://www.facebook.com/";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get(baseurl);
		WebElement txtUsername = driver.findElement(By.id("email"));
		
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
				.moveToElement(txtUsername)
				.click()
				.keyDown(txtUsername,Keys.SHIFT)
				.sendKeys(txtUsername,"hello")
				.keyUp(txtUsername,Keys.SHIFT)
				.doubleClick(txtUsername)
				.contextClick()
				.build();
		seriesOfActions.perform();

	}

}
