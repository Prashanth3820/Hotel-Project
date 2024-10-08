package com.omrbranch.pages;

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

	public WebElement getTxtEmailId() {
		return txtEmailId;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	

}
