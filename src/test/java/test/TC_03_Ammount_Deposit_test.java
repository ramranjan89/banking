
package test;

import org.testng.annotations.Test;

import baseclass.Base;
import uimap.Amount_Deposit_Form_page;
import uimap.Login_Page;
import util.Read_datafile;

public class TC_03_Ammount_Deposit_test extends Base {

	
	
	@Test
	public void  amountdepoit_test()
	{
		driver.get(url);
		log.info("url opend");
		Login_Page login=new Login_Page(driver);
		Amount_Deposit_Form_page amd=new Amount_Deposit_Form_page(driver);
		login.setUsername(username);
		login.setPassword(password);
		login.clickOnSubmit();
		Read_datafile read=new Read_datafile();
		amd.Deposiy_tab();
		amd.set_Account_No("86986998798");
		amd.set_Amount("56600");
		amd.set_messege("ammount deopsit");
		amd.submir_Button_click();
				
		
	}
}
