package com.stepdefinition;

import com.common.BaseClass;
import com.pages.RedbusSignuppage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RedBusSignUpSteps extends BaseClass{

	@Given("User is on Redbus page")
	public void user_is_on_redbus_page() {
//		ChromeBrowserLaunch();
//		implicitiwait(20);
//		loadUrl("https://www.redbus.in/");
//	//	maximize();
//		System.out.println(getTitle());
//		System.out.println(getCurrentUrl());

	}
	RedbusSignuppage obj;
	@When("User should verify after click on Account option Login Side bar should be displayed")
	public void user_should_verify_after_click_on_account_option_login_side_bar_should_be_displayed() {

		obj=new RedbusSignuppage();
		click(obj.getClickAccountOption());

	}
	@Then("User should verify after click on close button from Account Option Side bar should be closed")
	public void user_should_verify_after_click_on_close_button_from_account_option_side_bar_should_be_closed() {
	   click(obj.getSidebarCloseButton());

	}
	@Then("User should verify after click on SignUP option then displayed on SignUP popup box {string}")
	public void user_should_verify_after_click_on_sign_up_option_then_displayed_on_sign_up_popup_box(String msg) {
	    click(obj.getClickSignupOption());
	    System.out.println("Login box headline: "+msg);
	//    System.out.println(getText(obj.getTextSignuporLoginpagetitle()));
	}
	@Then("User should verify after click on country code then list should be displayed")
	public void user_should_verify_after_click_on_country_code_then_list_should_be_displayed() {
		click(obj.getClickCountryCode());

	}
	@Then("User should verify after click on country code radio btn list should select and displayed")
	public void user_should_verify_after_click_on_country_code_radio_btn_list_should_select_and_displayed() {
	  click(obj.getSelectCountryWithRadio());
	}
	@Then("User should verify after enter any letters or numbers in the country code list search bar related name or code displayed and selectable {string}")
	public void user_should_verify_after_enter_any_letters_or_numbers_in_the_country_code_list_search_bar_related_name_or_code_displayed_and_selectable(String anyLettersOrNumbers) {
	 sendkeys(obj.getSearchCountryFromlist(), anyLettersOrNumbers);
	 click(obj.getSelectCountryWithRadio());
	}
	@Then("User should enter the valid phone number {string}")
	public void user_should_enter_the_valid_phone_number(String validNumber) throws InterruptedException {
	 sendkeys(obj.getEnterphoneNumber(), validNumber);
	 waitForClickable(obj.getBtnGenerateOtp(), 30);
	}
	@Then("User should verify generate OTP and btn clickable using valid phone number then navigate to OTP menu {string}")
	public void user_should_verify_generate_otp_and_btn_clickable_using_valid_phone_number_then_navigate_to_otp_menu(String Otppage){
		click(obj.getBtnGenerateOtp());
		System.out.println("OTP box headline: "+Otppage);
	}
	@Then("User should enter the invalid phone number {string}")
	public void user_should_enter_the_invalid_phone_number(String invalidNo) throws InterruptedException {
	 sendkeys(obj.getEnterphoneNumber(), invalidNo);
	 sleep(3000);
	}
	@Then("User should verify enter invalid phone number displayed error message contains {string}")
	public void user_should_verify_enter_invalid_phone_number_displayed_error_message_contains(String errormsg) throws InterruptedException {
		click(obj.getBtnGenerateOtp());
		System.out.println("Invalid no error msg: "+errormsg);
		sleep(2000);

	}
//	@Then("User click on edit option")
//	public void user_click_on_edit_option() {
//
//	}
//	@Then("User delete the existing phone number using backspace key")
//	public void user_delete_the_existing_phone_number_using_backspace_key() {
//
//	}
//	@Then("User should enter new phone no {string}")
//	public void user_should_enter_new_phone_no(String string) {
//
//	}
//	@Then("User should verify after click on generate OTP with recaptcha then navigate to OTP pop up box")
//	public void user_should_verify_after_click_on_generate_otp_with_recaptcha_then_navigate_to_otp_pop_up_box() {
//
//	}
//	@Then("User should verify generate OTP btn clickable using valid phone number then navigate to OTP menu {string}")
//	public void user_should_verify_generate_otp_btn_clickable_using_valid_phone_number_then_navigate_to_otp_menu(String string) {
//
//	}
//	@Then("User should verify after click on generate OTP without recaptcha error msg contains\"OTP sending failed\"")
//	public void user_should_verify_after_click_on_generate_otp_without_recaptcha_error_msg_contains_otp_sending_failed() {
//
//	}
//	@Then("User should verify click on verifyOTP btn using valid OTP then navigate to home page")
//	public void user_should_verify_click_on_verify_otp_btn_using_valid_otp_then_navigate_to_home_page() {
//
//	}
//	@Then("User should verify click on verifyOTP btn using invalid OTP error msg contains {string}")
//	public void user_should_verify_click_on_verify_otp_btn_using_invalid_otp_error_msg_contains(String string) {
//
//	}




}
