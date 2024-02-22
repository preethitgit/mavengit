package org.test;

import org.info.BaseClass;
import org.pojo.LoginPojo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter extends BaseClass {

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
	
	@Parameters({"user","pass"})
	//@parameter({"user","Pass"}) --for@Optional in pass Caps(P)
	@Test
	private void tc3(String email,String password) {//(@Optional("Flash123")String email,@optional("Flash")String password 
		launchBrowser();
		url("https://www.facebook.com/");
		maximize();
		LoginPojo l=new LoginPojo();
		fill(l.getTxtEmail(), email);
		fill(l.getTxtPass(), password);
		toClick(l.getBtnlogin());
		toQuit();

	}
	@Test
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

	
	
	
}
