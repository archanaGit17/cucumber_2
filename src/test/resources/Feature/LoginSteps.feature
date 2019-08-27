Feature: Validate demo site

  Scenario Outline: Validate registration details
    Given user is on demoautomation site
    When User enters the "<firstname>","<lastname>","<address>","<emailId>","<phoneno>","<password>","<confirmpassword>" and then click submit button
    Then verify url contains WebTable

    Examples: 
      | firstname | lastname | address | emailId                    | phoneno    | password    | confirmpassword |
      | archana   | subbian  | chennai | archanasubbian22@gmail.com | 9003261856 | Archana$123 | Archana$123     |
