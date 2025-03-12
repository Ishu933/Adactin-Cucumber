package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.SeleniumBasePon;

public class BookingConfirmPage extends SeleniumBasePon{
public BookingConfirmPage() {
	
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//td[text()='Booking Confirmation ']")

private WebElement bookingConfirmPage;

public WebElement validateBookingConfrimPage() {
	
	return bookingConfirmPage;
}

@FindBy(xpath="//td[text()='Booking Confirmation ']")

private WebElement ConfirmText;

public WebElement getConfirmText() {
	
	return ConfirmText;
}

@FindBy(xpath="//input[@id='order_no']")

private WebElement order_no;

public WebElement getorder_no() {
	
	return order_no;
}

@FindBy(xpath="//input[@name='my_itinerary']")
//input[@id='my_itinerary']

private WebElement my_itinerary;

public WebElement getmy_itinerary() {
	
	return my_itinerary;
}

}
