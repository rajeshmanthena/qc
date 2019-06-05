package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
public TestBase(){
	
	try {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("D:/QC_WORKSPACE/qcpom/src/repository/input.properties");
		prop.load(fis);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}

public static void initiate(){
	
	System.setProperty("webdriver.ie.driver", "C:/Drivers/IEDriverServer.exe");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
	}


}


