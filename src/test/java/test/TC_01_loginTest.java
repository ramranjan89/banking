package test;

import org.testng.annotations.Test;

import baseclass.Base;
import uimap.Login_Page;

public class TC_01_loginTest extends Base {

	@Test
	public void loginTest() throws InterruptedException {
		driver.get(url);
		log.info("url is opend....................................");
		Login_Page lg = new Login_Page(driver);

		lg.setUsername(username);
		log.info("username is entered corretly.........................");
		lg.setPassword(password);
		log.info("password entered sucessfully.........................");
		lg.clickOnSubmit();
		log.info("home page displayed after clicking on submit.........");
	}
}