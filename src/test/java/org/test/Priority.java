package org.test;

import java.util.Date;

import org.info.BaseClass;
import org.pojo.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority extends BaseClass {

	
	@Test(priority=-66)// negative value executes 1st
	private void tc1() {

		launchBrowser();
		url("https://www.facebook.com/");
		maximize();
		LoginPojo l=new LoginPojo();
		fill(l.getTxtEmail(), "Preethi");
		fill(l.getTxtPass(), "Preethi123");
		toClick(l.getBtnlogin());
		toQuit();
	}
	
	@Test(priority=99, invocationCount=3)//positive priority value executes last, Invocationcount=3 repeats a testcase thrice
	private void tc3() {
		launchBrowser();
		url("https://www.facebook.com/");
		maximize();
		LoginPojo l=new LoginPojo();
		fill(l.getTxtEmail(), "Flash");
		fill(l.getTxtPass(), "Flash123");
		toClick(l.getBtnlogin());
		toQuit();

	}
	@Test// not setting priority means default (priority=0)
	private void tc2() {
		launchBrowser();
		url("https://www.facebook.com/");
		maximize();
		LoginPojo l=new LoginPojo();
		fill(l.getTxtEmail(), "Chamu");
		fill(l.getTxtPass(), "Chamu123");
		toClick(l.getBtnlogin());	
		toQuit();

	}
@Test(enabled=false)// To Ignore the particular testcase
private void tc4() {
	launchBrowser();
	url("https://www.facebook.com/");
	maximize();
	LoginPojo l=new LoginPojo();
	fill(l.getTxtEmail(), "Chamu");
	fill(l.getTxtPass(), "Chamu123");
	toClick(l.getBtnlogin());	
	toQuit();

}

	
}
