package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass1;

public class SearchHotelPage extends BaseClass1 {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@data-testid='username']")
	private WebElement textLoginSuccessMsg;
	
	public WebElement getTextLoginSuccessMsg() {
		return textLoginSuccessMsg;
	}
	
	//then user should verify success message after login "Welcome Prashanth"
	public String getLoginSuccessMsgText() {
		String elementGetText = elementGetText(textLoginSuccessMsg);
		System.out.println(elementGetText);
		return elementGetText;
	}


	@FindBy(id="state")
	private WebElement drpState;
	
	@FindBy(id="city")
	private WebElement txtCity;
	
	@FindBy(id="room_type")
	private WebElement txtRoomType;
	
	@FindBy(name="check_in")
	private WebElement checkIn;
	
	@FindBy(name="check_out")
	private WebElement checkOut;
	
	@FindBy(id="no_rooms")
	private WebElement txtRooms;
	
	@FindBy(id="no_adults")
	private WebElement txtAdults;
	
	@FindBy(id="no_child")
	private WebElement txtChild;
	
	@FindBy(id="searchBtn")
	private WebElement btnSearch;
	
	@FindBy(id="hotelsearch_iframe")
	private WebElement frame;
	
	@FindBy(id="invalid-state")
	private WebElement errorState;
	
	@FindBy(id="invalid-city")
	private WebElement errorCity;
	
	@FindBy(id="invalid-check_in")
	private WebElement errorCheckin;
	
	@FindBy(id="invalid-check_out")
	private WebElement errorCheckout;
	
	@FindBy(id="invalid-no_rooms")
	private WebElement errorNorooms;
	
	@FindBy(id="invalid-no_adults")
	private WebElement errorNoadults;

	public WebElement getDrpState() {
		return drpState;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtRoomType() {
		return txtRoomType;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getTxtRooms() {
		return txtRooms;
	}

	public WebElement getTxtAdults() {
		return txtAdults;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	public WebElement getFrame() {
		return frame;
	}
	
	
	public WebElement getTxtChild() {
		return txtChild;
	}
	
	

	public WebElement getErrorState() {
		return errorState;
	}

	public WebElement getErrorCity() {
		return errorCity;
	}

	public WebElement getErrorCheckin() {
		return errorCheckin;
	}

	public WebElement getErrorCheckout() {
		return errorCheckout;
	}

	public WebElement getErrorNorooms() {
		return errorNorooms;
	}

	public WebElement getErrorNoadults() {
		return errorNoadults;
	}

	public void searchHotel(String stateName, String cityName,String roomType, String checkInDate, String checkOutDate, String noOfRooms, String noOfAdults,
			String noOfChild) {
		elementSendKeys(drpState, stateName);
		selectOptionByValue(txtCity,cityName);
		selectOptionByValue(txtRoomType, roomType);
		elementSendKeysJs(checkIn, checkInDate);
		elementSendKeysJs(checkOut, checkOutDate);
		selectOptionByText(txtRooms, noOfRooms);
		selectOptionByText(txtAdults, noOfAdults);
		elementSendKeysJs(txtChild,noOfChild);
		
		switchToFrameByWebElement(frame);
		elementClick(btnSearch);
		driver.switchTo().defaultContent();
		
	}
	
	public void searchHotelWithMandField(String stateName, String cityName, String checkInDate, String checkOutDate, String noOfRooms, String noOfAdults) {
		elementSendKeys(drpState, stateName);
		selectOptionByValue(txtCity,cityName);
		elementSendKeysJs(checkIn, checkInDate);
		elementSendKeysJs(checkOut, checkOutDate);
		selectOptionByText(txtRooms, noOfRooms);
		selectOptionByText(txtAdults, noOfAdults);
		
		switchToFrameByWebElement(frame);
		elementClick(btnSearch);
		driver.switchTo().defaultContent();

	}
	
	public void clickSearchButton() {
		switchToFrameByWebElement(frame);
		elementClick(btnSearch);
		driver.switchTo().defaultContent();
	}
	
	public String getStateErrorMsg() {
		String stateError = elementGetText(errorState);
		return stateError;
	}
	
	public String getCityErrorMsg() {
		String cityError = elementGetText(errorCity);
		return cityError;
	}
	
	public String getChecinErrorMsg() {
		String checkinError = elementGetText(errorCheckin);
		return checkinError;
	}
	
	public String getCheckoutErrorMsg() {
		String checkoutError = elementGetText(errorCheckout);
		return checkoutError;
	}
	
	public String getRoomsErrorMsg() {
		String roomsError = elementGetText(errorNorooms);
		return roomsError;

	}
	
	public String getAdultsErrorMsg() {
		String adultsError = elementGetText(errorNoadults);
		return adultsError;

	}
	
	
	
	

}
