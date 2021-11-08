package org.page;

import org.cmt.Basecls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class BookAHotel extends Basecls{

	public BookAHotel() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	 private WebElement firstname;
	@FindBy(id="last_name")
	 private WebElement lastname;
	@FindBy(id="address")
	 private WebElement address;
	@FindBy(id="cc_num")
	 private WebElement cardno;
	@FindBy(id="cc_type")
	 private WebElement cardtype;
	@FindBy(id="cc_exp_month")
	 private WebElement cardexprymonth;
	@FindBy(id="cc_exp_year")
	 private WebElement cardexpryyer;
	@FindBy(id="cc_cvv")
	 private WebElement ccv;
	
	@FindBy(id="book_now")
	 private WebElement booknow;

	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getCardexprymonth() {
		return cardexprymonth;
	}
	public WebElement getCardexpryyer() {
		return cardexpryyer;
	}
	public WebElement getCcv() {
		return ccv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
		
}
