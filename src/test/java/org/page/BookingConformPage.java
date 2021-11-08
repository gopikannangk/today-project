package org.page;

import org.cmt.Basecls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class BookingConformPage extends Basecls {
	public BookingConformPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	 private WebElement getorderid;

	public WebElement getGetorderid() {
		return getorderid;
	}

}
