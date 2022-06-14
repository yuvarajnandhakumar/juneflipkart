
@flipart
Feature: flipkart automation

  #one time execution

  @flipkartpayment22
  Scenario:Login and go to payment
    Given Launch browser
    And user emter credentials for flipkart "yuvarajsrec4@gmail.com"
    When user click login button
    And validate user screen
    And iser selects an items by searching
    Then go to payment screen
    Then validate the text and screenshot
    But user shouldnot see the gotocart screen

    #multi time execution
     @flipkartpayment222
     Scenario Outline:Login and go to paymentss
    Given Launch browser
    And user enter credentials for flipkart "<username>","<password>"
    When user click login button
    And validate user screen
    And iser selects an items by searching
    Then go to payment screen
    Then validate the text and screenshot
    But user shouldnot see the gotocart screen
    
    Examples:
    |username|password|
    |yuvaraj@gmail.com|asdf234|
    |pradeepa@gmail.com|56789vbnjk|
    
    
    @execution
  Scenario:try to login
    Given Launch browser
    And user emter credentials for flipkart "yuvarajsrec4@gmail.com"
    And enter password
