package crm_com_pom;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClass.BaseClass1;


public class test2 extends BaseClass1{
	@Test
	public void tc2()
	{
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Open Calendar...']")).click();
		
		driver.findElement(By.name("button")).click();
		
		
		
	}
		
	
		
		
		
		
		
		
				

	}


