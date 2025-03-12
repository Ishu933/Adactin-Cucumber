package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.SeleniumBasePon;

public class BookedIternityPage extends SeleniumBasePon {
	public BookedIternityPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='check_all']")
	private WebElement checkAll;

	public WebElement getCheckAll() {
		return checkAll;
	}

	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancelall;

	public WebElement getCancelall() {
		return cancelall;
	}
}