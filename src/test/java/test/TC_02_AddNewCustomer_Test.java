package test;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import baseclass.Base;
import uimap.Login_Page;
import uimap.New_customer_UI;

public class TC_02_AddNewCustomer_Test extends Base{

	@Test
	public void newcustomer_Test() throws Throwable, IOException {
		driver.get(url);
		log.info("url launched..................");
		New_customer_UI nc = new New_customer_UI(driver);
		Login_Page lp = new Login_Page(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickOnSubmit();
		log.info("successfully login to th application............");
		nc.clickonCustomer_Tab();
		log.info("clicked on Customer tab and all customer retalted details present...............");
		nc.setCustomer_Name("ram ranjan ojha");
		log.info("customer name enterd");
		nc.redioButton_click();
		log.info("click on male button in gender option..................");
		nc.setDateof_birth("09-03-1994");
		log.info("date birth enterd ..................");
		nc.setAddress("ckb layout 104 banglore");
		log.info("address deatils correctly enterd..................");
		nc.setCity("Bangalore");
		log.info("city name enterd..................");
		
		nc.setState("karnataka");
		log.info("state name enterd..................");
		nc.setPin_code("560037");
		log.info("pin code enterd..................");
		nc.set_mobile_no("9108411969");
		log.info("mobile no enterd..................");
		nc.set_email("ranjanjha89.rr@gmail.com");
		nc.set_password(password);
		nc.submit_button();
		
		Thread.sleep(5000);
		
		
		
		
	}
}