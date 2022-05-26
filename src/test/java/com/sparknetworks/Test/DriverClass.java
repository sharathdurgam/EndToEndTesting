package com.sparknetworks.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverClass {

	Properties prop = new Properties();

	FileInputStream fis ;
	static WebDriver driver;

	@BeforeMethod
	public void Initalization() throws IOException, InterruptedException {

		//Load All properties one time
		fis = new FileInputStream(System.getProperty("user.dir") + "//properties//config.properties");
		prop.load(fis);
	

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver");
		driver = new ChromeDriver();
		
		

		driver.get(prop.getProperty("BaseUrl"));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}

	@AfterMethod
	public void closure() {
		driver.close();
	}
}
