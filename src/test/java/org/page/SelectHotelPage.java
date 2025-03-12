package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.SeleniumBasePon;

public class SelectHotelPage extends SeleniumBasePon{
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//td[text()='Select Hotel ']"))
	
	private WebElement selectHotel;
	
	public WebElement validateSelectHotelPage() {
		
		return selectHotel;
	}

	@FindBy(xpath=("//td[text()='Select Hotel ']"))
	
	private WebElement searchHotelText;
	
	public WebElement getsearchHotelText() {

		return searchHotelText;
	}
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
	
	private WebElement selectHotelText;
	
	public WebElement getHotelText() {
		
		return selectHotelText;
		
	}
	@FindBy(xpath="//input[@id='radiobutton_0']")
	
	private WebElement select;
	
	public WebElement selectHotel() {
		
		return select;
		
	}
	@FindBy(xpath="//input[@id='continue']")
	private WebElement clickContinue;
	public WebElement clickContinueButton() {
		return clickContinue;
		
	}

}
