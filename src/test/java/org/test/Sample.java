package org.test;

import java.util.Date;

import org.info.BaseClass;
import org.pojo.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample extends BaseClass {


	@BeforeClass
	
	private void befClass() {
		Date d=new Date();
		System.out.println(d);

	}
	@AfterClass
	private void aftClass() {
		Date d=new Date();
		System.out.println(d);

	}
	@BeforeMethod
	private void bef() {
		launchBrowser();
		url("https://www.facebook.com/");
		maximize();

	}
	@AfterMethod
	private void aft() {
	toQuit();

	}
	
	@Test
	private void tc1() {
		LoginPojo l=new LoginPojo();
		fill(l.getTxtEmail(), "Preethi");
		fill(l.getTxtPass(), "Preethi123");
		toClick(l.getBtnlogin());
	}
	
	@Test
	private void tc3() {
		LoginPojo l=new LoginPojo();
		fill(l.getTxtEmail(), "Flash");
		fill(l.getTxtPass(), "Flash123");
		toClick(l.getBtnlogin());

	}
	@Test
	private void tc2() {
		LoginPojo l=new LoginPojo();
		fill(l.getTxtEmail(), "Chamu");
		fill(l.getTxtPass(), "Chamu123");
		toClick(l.getBtnlogin());	

	}
	
}
	
	
	


