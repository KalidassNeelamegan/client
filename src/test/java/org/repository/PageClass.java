package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.Utility;

public class PageClass extends Utility{
	
	public PageClass(){
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btn;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtn() {
		return btn;
	}
}
