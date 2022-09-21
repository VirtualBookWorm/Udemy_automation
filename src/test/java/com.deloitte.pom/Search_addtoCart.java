package com.deloitte.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Search_addtoCart {
WebDriver driver;
	
	WebElement shoppingCart;
	WebElement search;
	
	public Search_addtoCart(WebDriver drv) {
		this.driver = drv;
		shoppingCart = driver.findElement(By.linkText("Shopping cart"));
		search = driver.findElement(By.name("q"));
	}
	
	public String searchAdd(String item) {
		search.click();
		search.sendKeys(item);
		search.submit();
		
		driver.findElement(By.linkText(item)).click();
		driver.findElement(By.xpath("//input[@value=\"Add to cart\"]")).click(); //add to cart
		
		shoppingCart.click();
		Assert.assertTrue(driver.findElement(By.linkText(item)).isDisplayed());
		driver.findElement(By.linkText("Log out")).click();
		return "Item added to cart";
	}
}
