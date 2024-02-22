package org.test;


import org.info.BaseClass;
import org.pojo.LoginPojo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert1 extends BaseClass {

	@Test
	private void tc3() {
		//Hardassert - assertTrue, assertEquals --if tc is failed the next tc does not execute
		launchBrowser();
		url("https://www.facebook.com/");
		maximize();
		LoginPojo l=new LoginPojo();
		fill(l.getTxtEmail(), "Flash");//doggy
		//assertTrue
		String user = toAttribute(l.getTxtEmail());
		Assert.assertTrue(user.contains("Flash"), "To verify username");//Condition True
		fill(l.getTxtPass(), "Flash123");
		//assertEquals
		String pass = toAttribute(l.getTxtPass());//doggy123, Condition False
		Assert.assertEquals(pass, "doggy123", "To verify password");
		toClick(l.getBtnlogin());
		toQuit();
//SoftAssert- assertTrue,assertEquals,assertAll- if tc is failed also the next tc executes
	//@Test
	//private void tc3{
	//launchBrowser();
	//url("https://www.facebook.com/");
	//maximize();
	//LoginPojo l=new LoginPojo();
	//fill(l.getTxtEmail(), "Flash");//doggy
	//String user = toAttribute(l.getTxtEmail());
	//SoftAssert s= new SoftAssert();
	//s.assertTrue(user.equals("Flash"), "To verify username");//Condition True
	//fill(l.getTxtPass(), "Flash123");
	//String pass = toAttribute(l.getTxtPass());
	//s.assertEquals(pass, "doggy123", "To verify password");//Condition False
	//toClick(l.getBtnlogin());
	//toQuit();
	//s.assertAll();-- To check which test case is failed
	//}
	}
	@Test(enabled=false)
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
	
	@Test
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

}
