package com.omrbranch.stepdefinition;

import java.awt.AWTException;  
import java.io.FileNotFoundException; 
import java.io.IOException;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass1;
import com.omrbranch.pagemanager.PageObjectManager;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass1 {
	
	PageObjectManager pom = new PageObjectManager();

	@Given("User is on the OMR Branch hotel page")
	public void userIsOnTheOMRBranchHotelPage() throws FileNotFoundException, IOException {
		browserLaunch(getPropertyFileValue("browser"));
		enterApplnUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implicitWait();
	}
	@When("User login {string} and {string}")
	public void userLoginAnd(String userName, String password) {
		pom.getLoginPage().login(userName,password);
		
	    
	}
	@Then("User should verify success message after login {string}")
	public void userShouldVerifySuccessMessageAfterLogin(String expLoginMsg) throws InterruptedException {
		
		Thread.sleep(2000);
		String actLoginSuccessMsgText = pom.getSearchHotelPage().getLoginSuccessMsgText();
		
		Assert.assertEquals("Verify after login success message", expLoginMsg, actLoginSuccessMsgText);
		

	}

	

	

	@Given("User is on the OMR Branches hotel page")
	public void userIsOnTheOMRBranchesHotelPage() throws FileNotFoundException, IOException {
		browserLaunch(getPropertyFileValue("browser"));
		enterApplnUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implicitWait();
	}
	
	@When("User login {string} and {string} with enter key")
	public void userLoginAndWithEnterKey(String username, String password) throws AWTException {
		pom.getLoginPage().loginWithRobotEnter(username, password);
		
	}
	
	@Then("User should verify success messages after login {string}")
	public void userShouldVerifySuccessMessagesAfterLogin(String expLoginMsg) throws InterruptedException {
		Thread.sleep(2000);
		String actLoginSuccessMsgText = pom.getSearchHotelPage().getLoginSuccessMsgText();
		System.out.println(actLoginSuccessMsgText);
		Assert.assertEquals("Verify after login success message", expLoginMsg, actLoginSuccessMsgText);
		
	}


	
	@Then("User should verify error message after login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String expErrorMsgTxt) {
		
		String errorMsg = pom.getLoginPage().getErrorMsgTxt();
		Boolean b = errorMsg.contains(expErrorMsgTxt);
		Assert.assertTrue("Verify after login error msg contains", b);
	}








}
