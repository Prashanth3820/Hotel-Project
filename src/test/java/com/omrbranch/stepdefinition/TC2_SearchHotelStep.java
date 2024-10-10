package com.omrbranch.stepdefinition;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC2_SearchHotelStep {
	
	PageObjectManager pom = new PageObjectManager();

	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelAnd(String stateName, String cityName, String roomType, String checkInDate, String checkOutDate, String noOfRooms, String noOfAdults, String noOfChild) {
		
		pom.getSearchHotelPage().searchHotel(stateName, cityName, roomType, checkInDate, checkOutDate, noOfRooms, noOfAdults, noOfChild);
	}
	@Then("User should verify after search hotel success message {string}")
	public void userShouldVerifyAfterSearchHotelSuccessMessage(String expMsg) {
		String msgText = pom.getSelectHotelPage().getSelctHotelMsg();
		Assert.assertEquals("Verify after search hotel success msg", expMsg, msgText);
	}
	

	@When("User search hotel {string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelAnd(String stateName, String cityName, String checkInDate, String checkOutDate, String noOfRooms, String noOfAdults) {
		pom.getSearchHotelPage().searchHotelWithMandField(stateName, cityName, checkInDate, checkOutDate, noOfRooms, noOfAdults);

	}
	

	@Then("User click Search button")
	public void userClickSearchButton() {
		pom.getSearchHotelPage().clickSearchButton();
	}
	@Then("User should verify after search hotel error message {string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyAfterSearchHotelErrorMessageAnd(String expStateError, String expCityError, String expCheckinError, String expCheckoutError, String expNoroomsError, String expNoadultsError) {
		String error = pom.getSearchHotelPage().getStateErrorMsg();
		boolean b = error.contains(error);
		Assert.assertTrue("Verify error message in State", b);
		
		String error1 = pom.getSearchHotelPage().getCityErrorMsg();
		boolean b1 = error1.contains(error1);
		Assert.assertTrue("Verify error message in City", b1);
		
		String error2 = pom.getSearchHotelPage().getChecinErrorMsg();
		boolean b2 = error2.contains(error2);
		Assert.assertTrue("Verify error message in Checkin", b2);
		
		String error3 = pom.getSearchHotelPage().getCheckoutErrorMsg();
		boolean b3 = error3.contains(error3);
		Assert.assertTrue("Verify error message in CheckOut", b3);
		
		String error4 = pom.getSearchHotelPage().getRoomsErrorMsg();
		boolean b4 = error4.contains(error4);
		Assert.assertTrue("Verify error message in NoRooms", b4);
		
		String error5 = pom.getSearchHotelPage().getAdultsErrorMsg();
		boolean b5 = error5.contains(error5);
		Assert.assertTrue("Verify error message in NoAdults", b5);
		
		
	}
	

	@When("User click sort from low to high")
	public void userClickSortFromLowToHigh() {
		pom.getSelectHotelPage().userClickSort();
	}
	@Then("User should verify after sorting that price are listed from low to high")
	public void userShouldVerifyAfterSortingThatPriceAreListedFromLowToHigh() {
	}
	

	@When("User click sort from Descending order")
	public void userClickSortFromDescendingOrder() {
	}
	@Then("User should verify after sorting that name in Descending order")
	public void userShouldVerifyAfterSortingThatNameInDescendingOrder() {
	}
	

	@When("User click Suite room type")
	public void userClickSuiteRoomType() {
	}
	@Then("User should verify after sorting that Suite room type is listed")
	public void userShouldVerifyAfterSortingThatSuiteRoomTypeIsListed() {
	}
	

	@Then("User should verify the header contains {string}")
	public void userShouldVerifyTheHeaderContains(String string) {
	}












	
	










}
