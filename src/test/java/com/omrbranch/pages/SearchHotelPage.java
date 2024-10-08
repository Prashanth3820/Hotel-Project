package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass1;

public class SearchHotelPage extends BaseClass1 {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
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
	
	@FindBy(id="searchBtn")
	private WebElement btnSearch;
	
	@FindBy(id="hotelsearch_iframe")
	private WebElement frame;

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
	
	
	
	

}
