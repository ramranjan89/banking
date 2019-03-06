package uimap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_customer_UI {
	WebDriver driver;
	
	public New_customer_UI(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

	//==================UI WebElements===================================================
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement NewCustomer_tab;
	
	@FindBy(name="name")
	WebElement Custumername;
	@FindBy(xpath="//input[@type='radio']")
	WebElement Gender_radio_button;
	@FindBy(name="dob")
	WebElement DateofBirth;
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement Address;
	
	@FindBy(name="city")
	WebElement City;
	@FindBy(name="state")
	WebElement State;
	@FindBy(name="pinno")
	WebElement Pincode;
	@FindBy(name="telephoneno")
	WebElement Mobileno;
	@FindBy(name="sub")
	WebElement Submit_btn;
	@FindBy(name="emailid")
	WebElement email_id;
	@FindBy(name="password")
	WebElement passwrd;

	//==================UI WebElements(Method)===================================================
	public void clickonCustomer_Tab()
	{
		NewCustomer_tab.click();
	}
	public void setCustomer_Name(String cusname)
	{
		Custumername.sendKeys(cusname);
	}
	public void redioButton_click()
	{
		Gender_radio_button.click();
	}
	public void setDateof_birth(String dob)
	{
		DateofBirth.sendKeys(dob);
	}
	public void setAddress(String add)
	{
		Address.sendKeys(add);
	}
	public void setCity(String cityname)
	{
		City.sendKeys(cityname);
	}
	public void setState(String statename)
	{
		State.sendKeys(statename);
	}
	public void setPin_code(String pinno)
	{
		Pincode.sendKeys(pinno);
	}
	public void set_mobile_no(String mobile)
	{
		Mobileno.sendKeys(mobile);
	}
	public void set_email(String email)
	{
		email_id.sendKeys(email);
	}
	public void set_password(String password)
	
	{
		passwrd.sendKeys(password);
	}
	public void submit_button()
	{
		Submit_btn.click();
	}
	
}
