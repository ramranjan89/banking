package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

	public class TestUtil {
		public static WebDriver driver;
		public TestUtil(WebDriver driver) {
			this.driver = driver;
		}
	
		public static String getData(String propertyvalue) {
			File file = new File("C:\\Users\\Rajni\\eclipse-workspace\\banking\\configuration\\config.properties");
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			Properties prop = new Properties();
			// load properties file
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return prop.getProperty(propertyvalue);
		}
}
