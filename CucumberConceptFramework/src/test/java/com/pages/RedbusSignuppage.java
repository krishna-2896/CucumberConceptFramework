package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.BaseClass;

public class RedbusSignuppage extends BaseClass{

	public RedbusSignuppage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Account']")
	private WebElement clickAccountOption;
	@FindBy(xpath ="//div[@style='--button-width: 100%;']/child::button[@role='button']")
	private WebElement sidebarCloseButton;
	@FindBy(xpath= "//span[text()='Sign up']/parent::button")
	private WebElement clickSignupOption;
	@FindBy(xpath= "//h2[text()='Login to get exciting offers']")
	private WebElement textSignuporLoginpagetitle;
	@FindBy(xpath= "//div[text()='+91 (IND)']")
	private WebElement clickCountryCode;
	@FindBy(xpath= "//div[text()='India (91)']")
	private WebElement selectCountryWithRadio;
	@FindBy(xpath= "//input[@placeholder='Search']")
	private WebElement searchCountryFromlist;
	@FindBy(xpath= "//input[@inputmode='numeric']")
	private WebElement enterphoneNumber;
	@FindBy(xpath= "//button[text()='Generate OTP']")
	private WebElement btnGenerateOtp ;



	public WebElement getEnterphoneNumber() {
		return enterphoneNumber;
	}

	public WebElement getBtnGenerateOtp() {
		return btnGenerateOtp;
	}

	public WebElement getSelectCountryWithRadio() {
		return selectCountryWithRadio;
	}

	public WebElement getSearchCountryFromlist() {
		return searchCountryFromlist;
	}

	public WebElement getClickCountryCode() {
		return clickCountryCode;
	}

	public WebElement getClickAccountOption() {
		return clickAccountOption;
	}
	public WebElement getSidebarCloseButton() {
		return sidebarCloseButton;
	}
	public WebElement getClickSignupOption() {
		return clickSignupOption;
	}
	public WebElement getTextSignuporLoginpagetitle() {
		return textSignuporLoginpagetitle;
	}

}
