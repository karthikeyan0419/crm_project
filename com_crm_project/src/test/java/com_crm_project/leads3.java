package com_crm_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

import BaseClass.BaseClass1;

public class leads3 extends BaseClass1{
	@Test
	public void tcl_3()
	{
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("ABC");
		driver.findElement(By.name("lastname")).sendKeys("abc");
		driver.findElement(By.name("company")).sendKeys("google");
		driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='abc']")).click();
	
		driver.findElement(By.xpath("(//input[@class='crmbutton small create'])[1]")).click();
		driver.findElement(By.name("firstname")).sendKeys("1");
		driver.findElement(By.name("lastname")).sendKeys("1");
		driver.findElement(By.name("company")).sendKeys("1");
		driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		driver.findElement(By.xpath("(//a[text()='Leads'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='abc1']")).click();
		driver.findElement(By.name("Delete")).click();
		Alert pop = driver.switchTo().alert();
		pop.accept();
		Assert.assertTrue(false);
	}

}
