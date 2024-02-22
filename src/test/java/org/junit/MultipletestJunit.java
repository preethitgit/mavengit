package org.junit;

import java.util.Date;

import org.info.BaseClass;
import org.pojo.LoginPojo;

public class MultipletestJunit extends BaseClass {
    //1
	@BeforeClass
	
	public static void befclass() {
		Date d=new Date();
		System.out.println(d);
	}
	//5
	@AfterClass
	
	public static void aftClass() {
		Date d=new Date();
		System.out.println(d);
	}
	//2
	@Before
	public void bef() {
	
		launchBrowser();
		url("https://en-gb.facebook.com/");
		maximize();
	}
	//4
	@After
	public void aft() {
	 toQuit();
	}
	//3
	@Test
	
	public void tc1() {
		LoginPojo l=new LoginPojo();
		fill(l.getTxtEmail(), "Preethi");
		fill(l.getTxtPass(), "preethi123");
		toClick(l.getBtnlogin());
	}
	//testcase using assert -verify and validate
	@Test
	public void tc3() {
		LoginPojo l=new LoginPojo();
		fill(l.getTxtEmail(), "Chamu");//preethi
		String user = toAttribute(l.getTxtEmail());
		//Assert.assertTrue("To validate username field", user.contains("preethi"));//false
		Assert.assertTrue("To validate username field", user.contains("Chamu"));//True
		fill(l.getTxtPass(), "chamu123");
		                          //chamu123 
		String pass = toAttribute(l.getTxtPass());
		                                                 //pass- chamu123 
		Assert.assertEquals("To validate password field", pass, "chamu123");//True
	  //Assert.assertEquals("To validate password field", pass, "preethi123");//false
		toClick(l.getBtnlogin());
	}
	//@Ignore- method used to skip the particular testcase
	@Test
	public void tc2() {
		LoginPojo l=new LoginPojo();
		fill(l.getTxtEmail(), "Flash");
		fill(l.getTxtPass(), "flash123");
		toClick(l.getBtnlogin());
	}
}
