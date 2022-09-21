package com.deloitte.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Login {
	
	WebDriver driver;
	
	WebElement login;
	
	public Login(WebDriver drv) {
		this.driver = drv;		
		login = driver.findElement(By.linkText("Log in"));
	}
	
	public String clickLogin(String usr, String pass) {
		login.click();
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		username.click();
		username.sendKeys(usr);
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		password.click();
		password.sendKeys(pass);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		Assert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());
		return "Login successfull";
	}

}
