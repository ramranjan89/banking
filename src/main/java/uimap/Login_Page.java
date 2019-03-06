package uimap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page {
	WebDriver driver;
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//==================UI WebElements===================================================
	//@FindBy(xpath="//input[@type='text']")
	@FindBy(name="uid")
	WebElement usertext;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement userpassword;
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbutton;
	
	public void setUsername(String uname)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(usertext));
		Actions ac = new Actions(driver);
		ac.moveToElement(usertext).build().perform();
		
		usertext.sendKeys(uname);
	}
	public void setPassword(String upassword)
	{
		userpassword.sendKeys(upassword);
	}
	public void clickOnSubmit()
	{
		loginbutton.click();
	}

}
