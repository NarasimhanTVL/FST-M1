package com.example.fst_m1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	    driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
	 // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find the username field and enter the username
        //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]")).sendKeys("admin");
        // Find the password field and enter the password
        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[starts-with(@class, 'password-')]")).sendKeys("password");
        // Find the login button and click it
        //driver.findElement(By.xpath("//button[text()='Log in']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // Print the confirmation message
        String message = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
        System.out.println("Login message: " + message);

        // Close the browser
        driver.close();

	}

}
