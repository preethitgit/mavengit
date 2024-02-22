package org.pojo;

import org.info.BaseClass;


public class Test extends BaseClass {

public static void main(String[] args) {
		
		launchBrowser();
		url("https://en-gb.facebook.com/");
		maximize();
		currentUrl();
		title();
		
		LoginPojo l=new LoginPojo();
		fill(l.getTxtEmail(), "Preethi");
		fill(l.getTxtPass(), "preethi123");
		toClick(l.getBtnlogin());
		//To login Pojo method 1
		//WebElement email = l.getTxtEmail();
		//fill(email, "Preethi");
		
		//WebElement pass = l.getTxtPass();
		//fill(pass, "preethi123");
		
		//WebElement login = l.getBtnlogin();
		//toClick(login);
		
	
		
	}
	
}
