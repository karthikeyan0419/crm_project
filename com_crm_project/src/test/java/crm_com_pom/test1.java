package crm_com_pom;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClass.BaseClass1;


public class test1 extends BaseClass1 {


	@Test
	public void tc1() {
		
		
	driver.findElement(By.xpath("//a[text()=\"Organizations\"]")).click();
	driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	driver.findElement(By.name("accountname")).sendKeys("TYSSS");
	}

}
