package org.page;

import org.cmt.Basecls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class Loginpage extends Basecls {
	public Loginpage() {
    PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="username")
 private WebElement txtuser;
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtpass;
	
	@FindBy(id="login")
	private WebElement cliklogin;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getCliklogin() {
		return cliklogin;
	}
}
