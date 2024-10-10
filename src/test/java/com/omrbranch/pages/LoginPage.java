package com.omrbranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass1;


public class LoginPage extends BaseClass1 {
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="email")
	private WebElement txtEmailId;
	
	@FindBy(id="pass")
	private WebElement txtPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(id="errorMessage")
	private WebElement txtErrorMsg;

	public WebElement getTxtEmailId() {
		return txtEmailId;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	public WebElement getTxtErrorMsg() {
		return txtErrorMsg;
	}

	//When user login "<userName>" and "<password>"
	public void login(String userName, String password) {
		elementSendKeys(txtEmailId, userName);
		elementSendKeys(txtPassword, password);
		elementClick(btnLogin);
	}
	
	public void loginWithRobotEnter(String userName, String password) throws AWTException {
		elementSendKeys(txtEmailId, userName);
		elementSendKeysEnter(txtPassword, password);
		pressEnter();
		
	}
	
	public String getErrorMsgTxt() {
		String elemtGetText = elementGetText(txtErrorMsg);
		System.out.println(elemtGetText);
		return elemtGetText;

	}

}
