package util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Read_datafile {
	   Properties prop;
       public void getData()
       {
    	     File f=new File("C:\\Users\\Rajni\\eclipse-workspace\\banking\\configuration\\datadile.configuration");
    		  try
    		  {
    			  FileInputStream fis=new FileInputStream(f);
    			  prop=new Properties();
    			  prop.load(fis);
    		  }
    		  catch(Exception e)
    		  {
    			  System.out.println("my exception msg is"+ e.getMessage());
    		  }
    		  
    	  
       }
       public String account_no()
       {
    	   String account=prop.getProperty("accountNo");
    	   return account;
       }
       public String amount()
       {
    	   String amount=prop.getProperty("amount");
    	   return amount;
       }
       public String msg()
       {
    	   String msg=prop.getProperty("msg");
    	   return msg;
       }
}
