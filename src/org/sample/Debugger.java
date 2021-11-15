package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debugger {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\acer\\eclipse-workspace\\Selenium4\\driver\\chromedriver(2).exe");
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	
	WebElement user = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	user.sendKeys("flipkart" + Keys.ENTER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	

}
