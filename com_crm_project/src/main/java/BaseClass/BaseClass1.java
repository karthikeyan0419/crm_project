package BaseClass;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;




public class BaseClass1{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void configBM()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
	}

	/* @AfterMethod
	public void configAF()
	{
		driver.findElement(By.xpath("//td[@class='small']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.close();
	}
		
	*/
}
