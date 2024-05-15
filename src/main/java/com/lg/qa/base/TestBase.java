package com.lg.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lg.qa.util.TestUtil;

public class TestBase {
	
	public  static WebDriver driver;
	public  static Properties prop;
	
	public TestBase() throws IOException {
		
		try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\Programming\\JAVA\\PageObjectModel\\src\\main\\java"
				+ "\\com\\lg\\qa\\config\\config.properties");
		prop.load(ip);
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	 
	public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			//driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_time,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait,TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
			
			}
	}

}
