package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.SeleniumBasePon;

public class BookHotelPage extends SeleniumBasePon {

	public BookHotelPage() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//td[text()='Book A Hotel '] ")

	private WebElement HotelText;

	public WebElement validateBookHotelTextPage() {

		return HotelText;
	}

	@FindBy(xpath = "//td[text()='Book A Hotel '] ")

	private WebElement HotelFont;

	public WebElement getHotelFont() {

		return HotelFont;
	}

	@FindBy(xpath="//input[@id='first_name']")

	private WebElement firstName;

	public WebElement getFirstName() {

		return firstName;
	}

	@FindBy(xpath = "//input[@id='last_name']")

	private WebElement last_name;

	public WebElement getLastName() {

		return last_name;
	}

	@FindBy(xpath = "//textarea[@id='address']")

	private WebElement address;

	public WebElement getAddress() {

		return address;
	}

	@FindBy(xpath = "//input[@id='cc_num']")

	private WebElement cc_num;

	public WebElement getcc_num() {

		return cc_num;
	}

	@FindBy(xpath = "//select[@id='cc_type']")

	private WebElement cc_type;

	public WebElement getcc_type() {

		return cc_type;
	}

	@FindBy(xpath = "//select[@id='cc_exp_month']")

	private WebElement cc_exp_month;

	public WebElement getcc_exp_month() {

		return cc_exp_month;
	}

	@FindBy(xpath = "//select[@id='cc_exp_year']")

	private WebElement cc_exp_year;

	public WebElement getcc_exp_year() {

		return cc_exp_year;
	}

	@FindBy(xpath = "//input[@id='cc_cvv']")

	private WebElement cc_cvv;

	public WebElement getcc_cvv() {

		return cc_cvv;
	}

	@FindBy(xpath = "//input[@id='book_now']")

	private WebElement book_now;

	public WebElement getbook_now() {

		return book_now;
	}

}
