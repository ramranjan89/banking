package uimap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amount_Deposit_Form_page {
WebDriver driver;
public Amount_Deposit_Form_page(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Deposit']")
WebElement deposit_tab;
@FindBy(name="accountno")
WebElement accountNo_box;
@FindBy(name="ammount")
WebElement ammount_box ;
@FindBy(name="desc")
WebElement msg_box;
@FindBy(name="AccSubmit")
WebElement submit_butoon;


public void Deposiy_tab()
{
	deposit_tab.click();
}
public void set_Account_No(String accountno)
{
	accountNo_box.sendKeys(accountno);
}
public void set_Amount(String amount)
{
	ammount_box.sendKeys(amount);
}
public void set_messege(String discription)
{
	msg_box.sendKeys(discription);
}
public void submir_Button_click()
{
	submit_butoon.click();
}

}












