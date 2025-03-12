package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.SeleniumBasePon;

public class SearchHotelPage extends SeleniumBasePon {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Search Hotel ']")

	private WebElement searchHotel;

	public WebElement validateSearchHotelPage() {

		return searchHotel;
	}

	@FindBy(xpath = "//td[text()='Search Hotel ']")

	private WebElement searchHotelText;

	public WebElement getSearchHotelText() {

		return searchHotelText;
	}
	
	@FindBy(xpath = "//select[@id='location']")

	private WebElement location;

	public WebElement setLocation() {

		return location;
	}

	@FindBy(xpath = "//select[@id='hotels']")

	private WebElement hotels;

	public WebElement setHotels() {

		return hotels;
	}

	@FindBy(xpath = "//select[@id='room_type']")

	private WebElement room_type;

	public WebElement setRoomType() {

		return room_type;
	}

	@FindBy(xpath = "//select[@id='room_nos']")

	private WebElement room_nos;

	public WebElement setRoomNos() {

		return room_nos;
	}

	@FindBy(xpath = "//input[@id='datepick_in']")

	private WebElement datepick_in;

	public WebElement setCheckInDate() {

		return datepick_in;
	}

	@FindBy(xpath = "//input[@id='datepick_out']")

	private WebElement datepick_out;

	public WebElement setCheckOutDate() {

		return datepick_out;
	}

	@FindBy(xpath = "//select[@id='adult_room']")

	private WebElement adult_room;

	public WebElement setAdultRoom() {

		return adult_room;
	}

	@FindBy(xpath = "//select[@id='child_room']")

	private WebElement child_room;

	public WebElement setChildRoom() {

		return child_room;
	}

	@FindBy(xpath = "//input[@id='Submit']")

	private WebElement Submit;

	public WebElement setSubmit() {

		return Submit;
	}

}
