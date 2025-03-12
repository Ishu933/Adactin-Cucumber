Feature: Adactin Hotel WebPage Validation

  Scenario: Book a Hotel With Proper Procedure
    Given User Should Be Enter LogIn Procedure
    When User Should Be Search,Select Hotel
    And User Should Book Their Booking 
    Then User Should Successfully LogOut
