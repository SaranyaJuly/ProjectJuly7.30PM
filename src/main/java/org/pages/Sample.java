package org.pages;

import org.base.BaseClasss;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends BaseClasss{
	
public static void main(String[] args) {
	
	WebDriver driver = chromeBroswer();
	
	UrlLaunch("https://www.facebook.com/");
	
	implicitlywait(20);
						
		WebElement TxtUsername= driver.findElement(By.id("email"));
	TxtUsername.sendKeys("Saranya");
	
	WebElement Txtpassword = driver.findElement(By.id("pass"));
		Txtpassword.sendKeys("0987");
		
		WebElement Btnlogin = driver.findElement(By.name("login"));
		Btnlogin.click();
		
		
		
}
}
