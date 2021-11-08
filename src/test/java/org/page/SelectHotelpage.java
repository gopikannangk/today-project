package org.page;

import org.cmt.Basecls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
public class SelectHotelpage extends Basecls {
	public SelectHotelpage() {
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement selhotel;
	@FindBy(id="continue")
	private WebElement clikcontinue;
	

	public WebElement getClikcontinue() {
		return clikcontinue;
	}


	public WebElement getSelhotel() {
		return selhotel;
	}

}
