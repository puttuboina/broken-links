package org.sample;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public  class Chrome4 {
	
	public static void main(String[] args) throws InterruptedException, Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium4\\driver\\chromedriver(2).exe");
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Set<String> brokenlinks = new HashSet<String>();
		
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	for(WebElement link :links) {
		String linkUrl = link.getAttribute("href");
		URL url = new URL(linkUrl);
	
		URLConnection urlconnection =url.openConnection() ;
		HttpURLConnection httpURLConnection = (HttpURLConnection) urlconnection;
		httpURLConnection.setConnectTimeout(3000);
		httpURLConnection.connect();

	if(httpURLConnection.getResponseCode() !=200) 
	//	System.out.println(linkUrl + " "+ httpURLConnection.getResponseCode()+" "+ httpURLConnection.getResponseMessage());
	//	else 
	//		System.out.println(linkUrl + " "+ httpURLConnection.getResponseCode()+" "+ httpURLConnection.getResponseMessage());
	httpURLConnection.disconnect();

	
		}
	
	driver.quit();
	for (String brokenlink :brokenlinks ) {
		System.out.println(brokenlink);
		
	}
	
	
			
	}
	
		
		
				
				
			
			
	}		
			
		
		
		
		
        
	
	
	
	
           
	

	
	

	
	



