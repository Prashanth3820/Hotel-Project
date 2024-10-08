package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass1;

public class SelectHotelPage extends BaseClass1 {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[text()='Select Hotel']")
	private WebElement selectHotel;
	
	@FindBy(name="h5")
	private WebElement hotelNames;
	
	@FindBy(xpath="//strong[@class='total-prize']")
	private WebElement hotelPrices;
	
	@FindBy(xpath="//div[@id='hotellist']//a")
	private WebElement btnContinue;

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getHotelNames() {
		return hotelNames;
	}

	public WebElement getHotelPrices() {
		return hotelPrices;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	

}
