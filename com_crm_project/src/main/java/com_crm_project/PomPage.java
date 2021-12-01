package com_crm_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage extends WebDriverUtility{
	WebDriverUtility wb = new WebDriverUtility();
WebDriver driver=null;
	
	public void crm_proj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement org;	
	public void org() {
	org.click();
	}

	

	

}


