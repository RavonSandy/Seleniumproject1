package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm{
	
	static Xpath x1 = new Xpath();
	static Id id = new Id();
	static Name name = new Name();
	static ClassName cname = new ClassName();
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,30);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
       
        
    //partial linktext
      //Login
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#txtUsername"))).sendKeys("Admin");
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name=txtPassword]"))).sendKeys("admin123");
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.button"))).click();
    	//PDM
    	//wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Paul"))).click();
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_pim_viewPimModule"))).click();
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_pim_addEmployee"))).click();
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstName"))) .sendKeys("ipl");
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lastName"))) .sendKeys("match1");
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnSave"))).click();
       	Thread.sleep(2000);
       	//ADMIN
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_admin_viewAdminModule"))).click();   	
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_admin_UserManagement"))).click();
    	//ADD
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnAdd"))).click();
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("systemUser_employeeName_empName"))).sendKeys("ipl match1");
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("systemUser_userName"))).sendKeys("iplm278");
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("systemUser_password"))).sendKeys("iplmatch2000");
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("systemUser_confirmPassword"))).sendKeys("iplmatch2000");
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();
    	//ADDSearch
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchSystemUser_userName"))).sendKeys("iplm278");
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchSystemUser_employeeName_empName"))).sendKeys("ipl match1");
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchBtn"))).click();
    	//EMPLOYEE SEARCH
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_pim_viewEmployeeList"))).click();
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("empsearch_employee_name_empName"))).sendKeys("ipl match1");
    	
    	//wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout"))).click();
    	
    	
    //linktext
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#txtUsername"))).sendKeys("Admin");
    	//wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name=txtPassword]"))).sendKeys("admin123");
    	//wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.button"))).click();
    	//wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Welcome Paul"))).click();
    	//wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout"))).click();
    	
     //cssselector
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#txtUsername"))).sendKeys("Admin");
    	//wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name=txtPassword]"))).sendKeys("admin123");
    	//wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.button"))).click();
    	//wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a#welcome"))).click();
    	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(x1.logout()))).click();
            
    	//By ClassName
      		 // wait.until(ExpectedConditions.presenceOfElementLocated(By.name(name.username()))).sendKeys("Admin");
      		  wait.until(ExpectedConditions.presenceOfElementLocated(By.name(name.password()))).sendKeys("admin123");
      		  //wait.until(ExpectedConditions.presenceOfElementLocated(By.className(cname.login()))).click();
      		 // wait.until(ExpectedConditions.presenceOfElementLocated(By.className(cname.welcome()))).click();
      		 // wait.until(ExpectedConditions.elementToBeClickable(By.xpath(x1.logout()))).click();
      		 
        
        //By Name
		/*
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.name(name.username(
		 * )))).sendKeys("Admin");
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.name(name.password(
		 * )))).sendKeys("admin123");
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.name(name.login()))
		 * ).click();
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(x1.welcome())
		 * )).click();
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(x1.logout()))).
		 * click();
		 */
  
       
        //By ID
		/*
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id.username())))
		 * .sendKeys("Admin");
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id.password())))
		 * .sendKeys("admin123");
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id.login()))).
		 * click();
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id.welcome()))).
		 * click();
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(x1.logout()))).
		 * click();
		 */
        
        //By Xpath
		/*
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(x1.username()
		 * ))).sendKeys("Admin");
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(x1.password()
		 * ))).sendKeys("admin123");
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(x1.login())))
		 * .click();
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(x1.welcome())
		 * )).click();
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(x1.logout()
		 * ))).click();
		 */
       driver.close();
        
        /*driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        driver.close();*/
        

	}

}
