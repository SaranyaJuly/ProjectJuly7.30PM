package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasss {
	
	 static WebDriver driver;
	
 public static WebDriver chromeBroswer() {
	 WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		return driver;
		
}

 
 public static void UrlLaunch(String Url) {
	driver.get(Url);
	driver.manage().window().maximize();

}

public static void implicitlywait(int a ) {
	driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);
	

}

}
	
	
	
	
	

		
		
		
		
