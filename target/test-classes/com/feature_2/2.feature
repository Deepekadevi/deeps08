Feature: Rahulshetty Academy Automation Practice

  Scenario: User Login In Web Application
    Given User Launch the Automation Practice Application
    When User click the ratio button In Radio Button Example Field
    And User Enter Type of Select Countries In Suggession Class Example Field
    And User Select Option In Dropdown Example Field
    Then Click Option In Checkbox Example Filed

  Scenario: User switch to window handle fucntionality
    When I click on open Window button
    And User Find the handle of the new window and back to parent window
    Then user refresh The parent page

  Scenario: User switch to Tab handle fucntionality
    When I click on open Tab button
    And User Find the handle of the new tab and back to parent tab
    Then user refresh The parent tab

  Scenario: User switch to Alert accept fucntionality
    When I Enter Username In Switch To Alert Example Field
    And I Click On Alert Button
    Then I Switch to Alert Accept

  Scenario: User switch to Alert confirm fucntionality
    When I Enter Username In Switch To Alert Field
    And I Click On confirm Button
    Then I Switch to Alert Confirm

  Scenario: User Handle Web Table Example Field
    When User get row and get text
    And User get Colume and get text
    Then User Get single particular data
    
  Scenario: User Handle Element Displayed field
  When I Enter Username In Element Displayed field
    And I Hied Username In Element Displayed field
    Then I show Username In Element Displayed field
    
    Scenario: User Fixed web table 
    When I Fix row and get text
     And I Fix Colume and get text
    Then I Fix single particular data
    
    Scenario: user handle Mouse Hover 
    When I click Mouse Hover and perform action
    And I Click The Top In Mouse hover field
    Then I scroll down The page 
    
   
    
    
    
