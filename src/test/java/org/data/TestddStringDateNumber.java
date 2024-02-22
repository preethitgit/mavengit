package org.data;

import java.io.IOException;

import org.info.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestddStringDateNumber extends BaseClass {
	
public static void main(String[] args) throws IOException {
		
		launchBrowser();
		
		url("https://en-gb.facebook.com/");
		maximize();
		currentUrl();
		title();
		
		WebElement email = driver.findElement(By.id("email"));
		fill(email, excelRead("Sheet1", 0, 0));
		WebElement pass = driver.findElement(By.id("pass"));
	    fill(pass, excelRead("Sheet1", 0, 1));
		WebElement login = driver.findElement(By.name("login"));
		toClick(login);
		
		toQuit();
		
	}

}

