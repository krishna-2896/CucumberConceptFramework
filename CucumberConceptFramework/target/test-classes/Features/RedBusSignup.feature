@login
Feature: Verifying RedBus SignUP & Login Details

  Scenario Outline: Verifying after click on Account option Login Side bar should be displayed
    Given User is on Redbus page
    When User should verify after click on Account option Login Side bar should be displayed

  Scenario Outline: Verifying after click on Close button from Account Option Side bar should be closed
    Given User is on Redbus page
    When User should verify after click on Account option Login Side bar should be displayed
    Then User should verify after click on close button from Account Option Side bar should be closed

  Scenario Outline: Verifying user click on SignUp option SignUp popup box should be displayed
    Given User is on Redbus page
    When User should verify after click on Account option Login Side bar should be displayed
    Then User should verify after click on SignUP option then displayed on SignUP popup box "Login to get exciting offers"

  @smoke
  Scenario Outline: Verifying user click on Radio button from country code dropdown list then required code select and displayed
    Given User is on Redbus page
    When User should verify after click on Account option Login Side bar should be displayed
    Then User should verify after click on SignUP option then displayed on SignUP popup box "Login to get exciting offers"
    Then User should verify after click on country code then list should be displayed
    Then User should verify after click on country code radio btn list should select and displayed

  Scenario Outline: Verifying user enter any letters and numbers in coundry code list search bar related name or code is displayed and selectable
    Given User is on Redbus page
    When User should verify after click on Account option Login Side bar should be displayed
    Then User should verify after click on SignUP option then displayed on SignUP popup box "Login to get exciting offers"
    Then User should verify after click on country code then list should be displayed
    Then User should verify after enter any letters or numbers in the country code list search bar related name or code displayed and selectable "<AnyCharacterlettersornumbers>"

    Examples:
      | AnyCharacterlettersornumbers |
      | India                        |

  Scenario Outline: Verifying user enter the valid phone number then generate OTP and  button clickable
    Given User is on Redbus page
    When User should verify after click on Account option Login Side bar should be displayed
    Then User should verify after click on SignUP option then displayed on SignUP popup box "Login to get exciting offers"
    Then User should enter the valid phone number "<PhoneNo>"
    Then User should verify generate OTP and btn clickable using valid phone number then navigate to OTP menu "Enter the OTP we just sent you"

    Examples:
      | PhoneNo    |
      | 7305266403 |

  Scenario Outline: Verifying user enter the invalid phone number
    Given User is on Redbus page
    When User should verify after click on Account option Login Side bar should be displayed
    Then User should verify after click on SignUP option then displayed on SignUP popup box "Login to get exciting offers"
    Then User should enter the invalid phone number "<PhoneNo>"
    Then User should verify enter invalid phone number displayed error message contains "Please enter a valid mobile number"

    Examples:
      | PhoneNo    |
      | 5657576748 |
