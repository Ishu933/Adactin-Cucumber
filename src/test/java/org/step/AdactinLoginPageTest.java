package org.step;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.page.BookHotelPage;
import org.page.BookedIternityPage;
import org.page.BookingConfirmPage;
import org.page.LogInPage;
import org.page.LogOutPage;
import org.page.SearchHotelPage;
import org.page.SelectHotelPage;
import org.sample.SeleniumBasePon;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinLoginPageTest extends SeleniumBasePon {

	public static SeleniumBasePon seleniumBasePon = new SeleniumBasePon();
	public static SearchHotelPage searchHotelPage;
	public static SelectHotelPage selectHotelPage;
	public static BookHotelPage bookHotelPage;
	public static BookingConfirmPage bookingConfirmPage;
	public static BookedIternityPage bookedIternityPage;
	public static LogOutPage logOutPage;

	@Given("User Should Be Enter LogIn Procedure")
	public void user_should_be_enter_log_in_procedure() {

		try {
			seleniumBasePon.initDriver("chrome");
			seleniumBasePon.launchURL("https://adactinhotelapp.com/");

			System.out.println("BrowserLaunch Succesfully");
			seleniumBasePon.launchURL(getDatasFromWorkBook("task", 1, 2));
			System.out.println("Launced URL Successfully");

			logInPage = new LogInPage();

			if (logInPage.validateLogInPage().isDisplayed()) {
				System.out.println("User in login page");
			} else {
				System.out.println("user not in login page");
			}

			WebElement text = driver.findElement(By.xpath("//td[text()='Existing User Login - Build 1']"));
			String text2 = seleniumBasePon.getText(text);
			System.out.println(text2);

			WebElement userName = logInPage.getUserName();
			seleniumBasePon.sendKeysByjava(userName, getDatasFromWorkBook("task", 1, 0));
			// seleniumBasePon.sendKeysByjava(userName, "Ishu");
			WebElement password = logInPage.getPassword();
			seleniumBasePon.sendKeysByjava(password, getDatasFromWorkBook("task", 1, 1));
			// seleniumBasePon.sendKeysByjava(password, "123456");
			System.out.println("login Credentials Entered Successfully");

			WebElement loginButton = logInPage.loginButton();
			seleniumBasePon.clickByJava(loginButton);
			System.out.println("login Button Click Successfully");

		} catch (Exception e) {

		}

	}

	@When("User Should Be Search,Select Hotel")
	public void user_should_be_search_select_hotel() {

		try {

			searchHotelPage = new SearchHotelPage();
			selectHotelPage = new SelectHotelPage();

			if (searchHotelPage.validateSearchHotelPage().isDisplayed()) {
				System.out.println("User LoggedIn Succesfully");
			} else {
				System.out.println("User Not LoggedIn Successfully");
			}

			WebElement hotelText = searchHotelPage.getSearchHotelText();
			String text3 = seleniumBasePon.getText(hotelText);
			System.out.println(text3);
			System.out.println("Get Search Hotel Text Successfully");

//			seleniumBasePon.screenCapture("searchHotel");
//			seleniumBasePon.screenCapture2();
//			System.out.println("ScreenShot Taken Done");

			WebElement setLocation = searchHotelPage.setLocation();
			seleniumBasePon.selectByText(setLocation, "New York", "value");
			System.out.println("Entered Location Succesfully");

			WebElement setHotels = searchHotelPage.setHotels();
			seleniumBasePon.selectByText(setHotels, "Hotel Hervey", "value");
			System.out.println("Select the Hotel Successfully");

			WebElement setRoomType = searchHotelPage.setRoomType();
			seleniumBasePon.selectByText(setRoomType, "Super Deluxe", "value");
			System.out.println("Enter Room Type Succesfully");

			WebElement setRoomNos = searchHotelPage.setRoomNos();
			seleniumBasePon.selectByNumber(setRoomNos, 3);
			System.out.println("Enter RoomNumber Succesfully");
			Thread.sleep(2000);

			WebElement setCheckInDate = searchHotelPage.setCheckInDate();
			setCheckInDate.clear();
			seleniumBasePon.sendKeysByjava(setCheckInDate, "01/02/2025");
			System.out.println("Enter CheckIn Date Successfully");

			WebElement setCheckOutDate = searchHotelPage.setCheckOutDate();
			setCheckOutDate.clear();
			seleniumBasePon.sendKeysByjava(setCheckOutDate, "02/02/2025");
			System.out.println("Enter CheckOut Date Succesfully");
			seleniumBasePon.sleep(2000);

			WebElement setAdultRoom = searchHotelPage.setAdultRoom();
			seleniumBasePon.selectByText(setAdultRoom, "2", "value");
			System.out.println("Select AdultRoom Succesfully");
			seleniumBasePon.sleep(2000);

			WebElement setChildRoom = searchHotelPage.setChildRoom();
			seleniumBasePon.selectByText(setChildRoom, "2 - Two", "byText");
			System.out.println("Select ChildrRoom Succesfully");

			WebElement setSubmit = searchHotelPage.setSubmit();
			seleniumBasePon.clickByActions(setSubmit, "click");
			System.out.println("Click Submit Button Succesfully");

			if (selectHotelPage.validateSelectHotelPage().isDisplayed()) {
				System.out.println("User In Select Hotel Page");
			} else {
				System.out.println("User Not In Select Hotel Page");
			}

			WebElement selectHotelText = selectHotelPage.getHotelText();
			String text4 = seleniumBasePon.getText(selectHotelText);
			System.out.println(text4);

//			seleniumBasePon.screenCapture("selectHotel");
//			seleniumBasePon.screenCapture2();
//			System.out.println("ScreenShot Taken Done");

			WebElement selectHotel = selectHotelPage.selectHotel();
			seleniumBasePon.clickByJava(selectHotel);
			System.out.println("Click Select Button Sucessfully");

			WebElement clickContinueButton = selectHotelPage.clickContinueButton();
			seleniumBasePon.clickByJava(clickContinueButton);
			System.out.println("Click Continue Button Succesfully");
		} catch (Exception e) {

		}

	}

	@When("User Should Book Their Booking")
	public void user_should_book_their_booking() {

		try {

			bookHotelPage = new BookHotelPage();
			bookingConfirmPage = new BookingConfirmPage();
			bookedIternityPage = new BookedIternityPage();

			if (bookHotelPage.validateBookHotelTextPage().isDisplayed()) {
				System.out.println("User In Book Hotel Page");
			} else {
				System.out.println("User Not In Book Hotel Page");
			}

			WebElement hotelFont = bookHotelPage.getHotelFont();
			String text5 = seleniumBasePon.getText(hotelFont);
			System.out.println(text5);
			System.out.println("Get HotelFont Successfully");

			WebElement firstName = bookHotelPage.getFirstName();
			seleniumBasePon.sendKeysByjava(firstName, "PON SHANKAR");
			System.out.println("Enter FirstName successfully");

			WebElement lastName = bookHotelPage.getLastName();
			seleniumBasePon.sendKeysByjava(lastName, "BALU");
			System.out.println("Last Name Enter Succesfully");

			WebElement address = bookHotelPage.getAddress();
			seleniumBasePon.sendKeysByjava(address, "Erode 638004");
			System.out.println("Enter Address Successfully");

			WebElement getcc_num = bookHotelPage.getcc_num();
			seleniumBasePon.sendKeysByJSE(getcc_num, "9876543210712345");
			System.out.println("Enter CC Num Successfully");

			WebElement getcc_type = bookHotelPage.getcc_type();
			seleniumBasePon.clickByActions(getcc_type, "click");
			seleniumBasePon.selectByRobot();
			System.out.println("Get CC Type Successfully");

			WebElement getcc_exp_month = bookHotelPage.getcc_exp_month();
			seleniumBasePon.selectByText(getcc_exp_month, "March", "byText");
			System.out.println("Get Exp_Month Successfully");

			WebElement getcc_exp_year = bookHotelPage.getcc_exp_year();
			seleniumBasePon.selectByText(getcc_exp_year, "2027", "byText");
			System.out.println("Get Exp_Year Successfully");

			WebElement getcc_cvv = bookHotelPage.getcc_cvv();
			seleniumBasePon.sendKeysByjava(getcc_cvv, "234");
			System.out.println("Enter CC_CVV Number Successfully");

			WebElement getbook_now = bookHotelPage.getbook_now();
			seleniumBasePon.clickByJava(getbook_now);
			seleniumBasePon.sleep(10000);
			System.out.println("Click the Book Now Button Successfully");

			if (bookingConfirmPage.validateBookingConfrimPage().isDisplayed()) {
				System.out.println("User In BookingConfrim Page");
			} else {
				System.out.println("User Not In BookingConfrim Page");
			}

			WebElement confirmText = bookingConfirmPage.getConfirmText();
			String text6 = seleniumBasePon.getText(confirmText);
			System.out.println(text6);
			System.out.println("Text BookingConfrinText Get Sucessfully");

			WebElement getorder_no = bookingConfirmPage.getorder_no();
			seleniumBasePon.scrolling(getorder_no, "down");
			String textAttributeByJava = seleniumBasePon.getTextAttributeByJava(getorder_no);
			System.out.println(textAttributeByJava);
			System.out.println("Get Order Number Successfully");
			seleniumBasePon.sleep(10000);

			WebElement getmy_itinerary = bookingConfirmPage.getmy_itinerary();
			seleniumBasePon.clickByJava(getmy_itinerary);
			System.out.println("Click MyIternitry Button Successfully");

			WebElement checkAll = bookedIternityPage.getCheckAll();
			seleniumBasePon.clickByJava(checkAll);
			System.out.println("Click Check All Button Successfully");

			WebElement cancelall = bookedIternityPage.getCancelall();
			seleniumBasePon.clickByActions(cancelall, "click");
			seleniumBasePon.alert("accept");
			System.out.println("Click Cancel All Button Successfully");

//			seleniumBasePon.screenCapture("cancel");
//			seleniumBasePon.screenCapture2();
//			System.out.println("ScreenShot Taken Done");

		} catch (Exception e) {
		}

	}

	@Then("User Should Successfully LogOuts")
	public void user_should_successfully_log_outs() {

		try {

			logOutPage = new LogOutPage();
			WebElement clickLogout = logOutPage.getClickLogout();
			seleniumBasePon.clickByJava(clickLogout);
			System.out.println("Click LogOut Page Successfully");

//			seleniumBasePon.screenCapture("loginpage1");
//			seleniumBasePon.screenCapture2();
//			System.out.println("ScreenShot Taken Done");

			WebElement getclickLoginAgain = logOutPage.getclickLoginAgain();
			seleniumBasePon.clickByJava(getclickLoginAgain);
			System.out.println("LogIn Page View Succesffuly");

		} catch (Exception e) {
		}
		System.out.println("git and gitbash is executed");
		System.out.println("git and gitbash tester executed");
	}

}
