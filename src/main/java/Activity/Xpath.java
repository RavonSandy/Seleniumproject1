package Activity;

 public class Xpath 
{

	public String username()
	{
		String username ="//input[@name='txtUsername']";
		return username;	
	}
	
	public String password()
	{
		String password ="//input[@name='txtPassword']";
		return password;	
	}
	
	public String login()
	{
		String login ="//input[@name='Submit']";
		return login;	
	}
	
	public String welcome()
	{
		String welcome ="//a[@id='welcome']";
		return welcome;	
	}
	
	public String logout()
	{
		String logout ="//a[text()='Logout']";
		return logout;	
	}
	
}
