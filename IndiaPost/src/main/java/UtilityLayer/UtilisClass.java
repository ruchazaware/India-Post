package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class UtilisClass extends BaseClass{
	
	public static void sendKeys(WebElement wb,String value)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			wb.sendKeys(value);
		}
	}
	
	public static void SelectDropDown(WebElement wb,String value)
	{
		Select sel = new Select(wb);
		sel.selectByVisibleText(value);
	}
	
	public void ExplicitWait(WebElement wb,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOf(wb)).sendKeys(value);
	}
	
	public void click(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(wb)).click();
		
	}

}
