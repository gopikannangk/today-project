package org.page;

import org.cmt.Basecls;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class SerchHotel extends Basecls {
	public SerchHotel() {
      PageFactory.initElements(driver, this);
	
	
	}	

	@FindBy(id = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomno() {
		return roomno;
	}
	public WebElement getCheckindate() {
		return checkindate;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement roomno;

	@FindBy(id = "datepick_in")
	private WebElement checkindate;

	@FindBy(id = "datepick_out")
	private WebElement checkout;
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	@FindBy(id = "child_room")
	private WebElement childroom;
	@FindBy(name = "Submit")
	private WebElement submit;

}