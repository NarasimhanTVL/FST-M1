package com.example.fst_m1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://v1.training-support.net/selenium/login-form");
	    String homePageTitle = driver.getTitle();
	    System.out.println("Home page title is "+homePageTitle);
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.id("password")).sendKeys("password");
	    driver.findElement(By.xpath("//button[text()='Log in']")).click();
	 // Print the confirmation message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);
        //close the page
        driver.close();

	}

}
