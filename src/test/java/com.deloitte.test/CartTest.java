package com.deloitte.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class CartTest {
	
	WebDriver driver;
	
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public CartTest() throws FileNotFoundException, IOException {
		wb = new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\aritbanerjee\\eclipse-workspace\\Udemy_automation\\Database.xlsx")));
		sh = wb.getSheet("Sheet1");
	}
	
	@Test
	public void searchCart() {
		
	}
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./chromedrover.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
