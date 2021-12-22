package com_crm_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.BaseClass1;
public class leads2 extends BaseClass1{
	
	@Test 
	public void tcl_2() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='leads']")).click();
		driver.findElement(By.xpath("//a[text()='Go to Advanced Search']")).click();
		Select s=new Select(driver.findElement(By.name("fcol0")));
		s.selectByVisibleText("Salutation");
		Select ss=new Select(driver.findElement(By.id("fop0")));
		ss.selectByVisibleText("equals");
		driver.findElement(By.id("fval0")).sendKeys("karthi");
		driver.findElement(By.xpath("(//input[@class='crmbutton small create'])[2]")).click();
		Alert popup = driver.switchTo().alert();
		popup.accept();
		
	}

}
