package genericlibraries;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class webDriverUtilies {
public WebDriver driver;
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
		}
	
	public void mouseHover (WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
    
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
		
	}
	public void dragAndDrop(WebDriver driver,WebElement source,WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
		
	}
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	public void switchBcakFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void switchTabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		
		for(String b:child) {
			driver.switchTo().window(b);
			
		}
	}	
	public void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(+x+,+y+)");
	}
	
	public void screenShot(WebDriver driver,String screenshotName) throws IOException {
		//		File scrfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//		FileUtils.copyDirectory(scrfile, new File("screenshot"+System.currentTimeMillis()+".png"));
		TakesScreenshot ss= (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination= new File("./Screenshot/"+screenshotName+".PNG");
		Files.copy(source, destination);
			}
	
	}
		
	
		

