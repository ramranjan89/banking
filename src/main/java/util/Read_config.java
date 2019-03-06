package util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Read_config {
  
	Properties pro;
  
	public Read_config()
	{
		File src=new File("C:\\Users\\Rajni\\eclipse-workspace\\banking\\configuration\\config.properties");
		try
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		}
		catch(Exception e)
		{
			System.out.println("getting "+e.getMessage());
		}
	}
	public String getAppUrl()
	{
		String baseurl=pro.getProperty("url");
		return baseurl;
	}
  public String getUserName()
  {
	String username=pro.getProperty("username");
	return username;
  }
  
  public String getPassword()
  {
	String password=pro.getProperty("password");
	return password;
  }
  public String chromePath()
  {
	String driverpath=pro.getProperty("chromepath");
	return driverpath;
  }
  
  public String iePath()
  {
	String driverpath=pro.getProperty("iepath");
	return driverpath;
  }
}
