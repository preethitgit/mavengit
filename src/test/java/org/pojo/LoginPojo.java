package org.pojo;

import org.info.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	//1.Non-para constructor
	public LoginPojo() {
	  PageFactory.initElements(driver,this);
		
	}
	//2.webelement as private (set as private)
	@FindBys({
			//AND Operator- both condition should be satisfied
			@FindBy(xpath="//input[@id='email']"),//true
			@FindBy(xpath="//input[@name='email']")//true
			
	})
	
	
	//Using @Findby method to find locators
	//@FindBy(id="email")
	private WebElement txtEmail;
	//@FindBy(id="pass")
	@FindAll({
		//OR Operator anyone condition should be satisfied
		@FindBy(xpath="//input[@id='pass']"),//true
		@FindBy(xpath="//input[@name='password']")//false
	})
	private WebElement txtPass;
	 @FindBy(name="login")
	private WebElement btnlogin;
	//3.Getters to access those webelemnt outside of the class
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	

	
	
	
	
}
