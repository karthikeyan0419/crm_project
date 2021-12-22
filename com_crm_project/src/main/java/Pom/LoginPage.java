package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(name="user_name")
    private WebElement un;
    
    @FindBy(name="password")
    private WebElement pwd;
    
    @FindBy(id="submitButton")
    private WebElement login;
     
    public WebElement getuser()
    {
    	return un;
    }
    public WebElement getpwd()
    {
    	return pwd;
    }
    public void un()
    {
    	un.sendKeys("admin");
    	
    }
    public void pwd()
    {
    	pwd.sendKeys("admin");
    }
    public void login()
    {
    	login.click();
    }
}
