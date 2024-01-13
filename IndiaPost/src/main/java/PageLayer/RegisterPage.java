package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilisClass;

public class RegisterPage extends BaseClass{
	
	@FindBy(xpath = "//input[starts-with(@id,'ctl00_SPWebPartManager1_g_19865d08_0763_4e76_89db_c347d1b6935f_ctl00_txtUserI')]")
	WebElement user;

@FindBy(xpath = "(//select[@class='form-control'])[1]")
WebElement selGen;

@FindBy(xpath = "(//input[starts-with(@name,'ctl00$SPWebPartManager1')])[13]")
WebElement firstname;

@FindBy(xpath = "(//input[starts-with(@name,'ctl00$SPWebPartManager1')])[14]")
WebElement lastname;

@FindBy(xpath = "//select[starts-with(@name,'ctl00$SPWebPartManager1$g_19865d08_0763_4e76_89db_c347d1b6935f$ctl00$ddlHi')]")
WebElement hintQ;

@FindBy(xpath = "(//input[starts-with(@name,'ctl00$SPWebPartManager1')])[15]")
WebElement hintA;

@FindBy(xpath = "(//input[starts-with(@name,'ctl00$SPWebPartManager1')])[16]")
WebElement address;

@FindBy(xpath = "(//select[starts-with(@name,'ctl00$SPWebPartMana')])[3]")
WebElement country;

@FindBy(xpath = "(//select[starts-with(@name,'ctl00$SPWebPartMana')])[4]")
WebElement state;

@FindBy(xpath = "//input[starts-with(@name,'ctl00$SPWebPartManager1$g_19865d08_0763_4e76_89db_c347d1b6935f$ctl00$txtTo')]")
WebElement city;

@FindBy(xpath = "(//input[starts-with(@name,'ctl00$SPWebPartManager1')])[20]")
WebElement pcode;

@FindBy(xpath = "(//input[starts-with(@name,'ctl00$SPWebPartManager1')])[21]")
WebElement email;

@FindBy(xpath = "(//input[starts-with(@name,'ctl00$SPWebPartManager1')])[23]")
WebElement phone;


public RegisterPage()
{
	PageFactory.initElements(driver,this);
}

public void RegisterFunctionality(String uname,String Sel,String fname,String lname,String Hintq,String Hinta,String address1,String country1,String State,String City,String Pcode,String Email,String Phone)
{
	
   UtilisClass.sendKeys(user, uname);
   UtilisClass.SelectDropDown(selGen, Sel);
   UtilisClass.sendKeys(firstname, fname);
   UtilisClass.sendKeys(lastname, lname);
   UtilisClass.SelectDropDown(hintQ, Hintq);
   UtilisClass.sendKeys(hintA, Hinta);
   UtilisClass.sendKeys(address, address1);
   UtilisClass.SelectDropDown(country,country1);
   UtilisClass.SelectDropDown(state, State);
   UtilisClass.sendKeys(city, City);
   UtilisClass.sendKeys(pcode, Pcode);
   UtilisClass.sendKeys(email, Email);
   UtilisClass.sendKeys(phone, Phone);
}
}
	

	
	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
