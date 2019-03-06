package baseclass;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import util.Read_config;
import util.Read_datafile;

public class Base {
	
	//......reading configur data from configure class...............
	Read_config readconfig=new Read_config();
	
	public String url =readconfig.getAppUrl();
	public String username=readconfig.getUserName();
    public String password=readconfig.getPassword();
	public String chromepath=readconfig.chromePath();
	public String iepath=readconfig.iePath();
	
	
	
	//........creating webdriver variable for use every where........
	
	public static WebDriver driver;
	
	//....creating logger to use any where in project.........
	
	public static Logger log;
    
	//...........launching browser.................
    
	@BeforeClass
    public void setup()
    {
    	//confugring log4j in to get the log into the project...................
    	log=Logger.getLogger("ebanking");
    	PropertyConfigurator.configure("log4j.properties");
    	
    	//chromepath = TestUtil.getData("chromepath");
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajni\\eclipse-workspace\\banking\\driver\\chromedriver_2.40.exe");
    	System.setProperty("webdriver.chrome.driver",chromepath);
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	
    }
    //.................closing the browser.................
    @AfterClass
    public void tearDownn() throws InterruptedException
    {
    	Thread.sleep(3000);
    driver.close();
    }
  }
