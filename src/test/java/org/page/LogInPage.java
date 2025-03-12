package org.page;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.sample.SeleniumBasePon;

public class LogInPage extends SeleniumBasePon {

	// constructor creation
	public LogInPage() {
// page factory - class||initElements - method static||initalize or refresh the webelement
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath=("//td[text()='Existing User Login - Build 1']"))
	private WebElement logInText;
	public WebElement validateLogInPage() {
    return logInText;
	}
	
	// annotation - @find
	@FindBys({ @FindBy(how = How.XPATH, using = "//input[@id='username']"),
			@FindBy(xpath = "//input[@name='username']") })
	private WebElement username;
	public WebElement getUserName() {
		return username;
	}
		

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}

//	@FindBy(xpath="//input[@id='login']")
	@FindAll({ @FindBy(how = How.XPATH, using = "//input[@id='login']"),
			@FindBy(how = How.XPATH, using = "//input[@name='logjjin']") })

	private WebElement login;

	public WebElement loginButton() {

		return login;

	}

}
