package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass 
{

	private  RegisterPage regpg;
	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
	}
	
	@Test
	public void ValidateTest()
	{
	    regpg = new RegisterPage();
		regpg.RegisterFunctionality("1233","Mr.","Akshay","Patil","What is your Birth Place?","shirdi","Pune","Germany","Berlin","Nauen","41656","akshay@gmail.com","7894567812");
	}
	
	public void tearDown()
	{
		driver.quit();
	}
}
