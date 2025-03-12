package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.SeleniumBasePon;

public class LogOutPage extends SeleniumBasePon {
	public LogOutPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='logout']")
	private WebElement clickLogout;

	public WebElement getClickLogout() {
		return clickLogout;
	}
	@FindBy(xpath = "//a[text()='Click here to login again']")
	private WebElement clickLoginAgain;

	public WebElement getclickLoginAgain() {
		return clickLoginAgain;
	}
}
