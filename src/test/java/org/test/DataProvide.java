package org.test;

import java.util.Date;

import org.info.BaseClass;
import org.pojo.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide extends BaseClass {

	@Test
	private void tc1() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	@Test(dataProvider = "TestData")
	private void tc3(String user,String pass) {
		url("https://www.facebook.com/");

		LoginPojo l = new LoginPojo();
		fill(l.getTxtEmail(), user);
		fill(l.getTxtPass(), pass);
		toClick(l.getBtnlogin());

	}

	@Test
	private void tc2() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	@BeforeMethod
	private void bef() {
		Date d = new Date();
		System.out.println(d);

	}

	@AfterMethod
	private void aft() {
		Date d = new Date();
		System.out.println(d);

	}

	@BeforeClass
	private void befClass() {
		launchBrowser();

		maximize();

	}

	@AfterClass
	private void aftClass() {
		toQuit();

	}

	@DataProvider(name = "TestData")
	private String[][] data() {
		return new String[][] {

				{ "java", "java123" }, //
				{ "selenium", "selenium123" }, { "jira", "jira123" }

		};
	}
}
