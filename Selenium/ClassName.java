package com.example.fst_m1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassName {
	public static void main(String[] args) {
		// Setup the Firefox driver(GeckoDriver)
	   // WebDriverManager.firefoxDriver().setup();

	   // Create a new instance of the Firefox driver
	    WebDriver driver = new FirefoxDriver();
	    
	    // Open the browser
	    driver.get("https://v1.training-support.net");
	    String pageTitle=driver.getTitle();
	    System.out.println("Page Title is "+ pageTitle);
	    driver.findElement(By.id("about-link")).click();
	    System.out.println("Clicked AboutUs button");
	    //Print the title of new page
	    System.out.println("About page title: " + driver.getTitle());
	    driver.quit();
	}
}