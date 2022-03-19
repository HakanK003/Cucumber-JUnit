@smartBear @task
Feature: Smart Bear Order feature


  Scenario: Smart Bear order process verification
         #1. User is logged into SmartBear Tester account and on Order page
    Given User is logged into SmartBear Tester account and on Order page
         #2. User fills out the form as followed:
         #3. User selects "FamilyAlbum" from product dropdown
    When User selects "FamilyAlbum" from product dropdown
         #4. User enters 4 to quantity
    And User enters "4" to quantity
         #5. User enters John Wick to costumer name
    And User enters "John Wick" to costumer name
         #6. User enters Kinzie Ave to street
    And User enters "Kinzie" Ave to street
         #7. User enters Chicago to city
    And User enters "Chicago" to city
         #8. User enters IL to state
    And User enters "IL" to state
         #9. User enters 60056
    And User enters "60056" to zip
         #10. User selects Visa as card type
    And User selects "Visa" as card type
         #11. User enters 1111222233334444 to card number
    And User enters "1111222233334444" to card number
         #12. User enters 12/22 to expiration date
    And User enters "12/22" to expiration date
         #13. User clicks process button
    And User clicks process button
         #14. User verifies John Wick is in the list
    Then User verifies "John Wick" is in the list

  @ScenarioOutline
  Scenario Outline: Smart Bear order process verification
    Given User is logged into SmartBear Tester account and on Order page
    When User selects "<productType>" from product dropdown
    And User enters "<quantity>" to quantity
    And User enters "<costumerName>" to costumer name
    And User enters "<street>" Ave to street
    And User enters "<city>" to city
    And User enters "<state>" to state
    And User enters "<zip>" to zip
    And User selects "<cardType>" as card type
    And User enters "<cardNo>" to card number
    And User enters "<expirationDate>" to expiration date
    And User clicks process button
    Then User verifies "<verifyName>" is in the list

    Examples: search values we are going to be using in this scenario is as below
      | productType | quantity | costumerName     | street           | city      | state | zip       | cardType         | cardNo           | expirationDate | verifyName       |
      | FamilyAlbum | 4        | John Wick        | Kinzie Ave       | Chicago   | IL    | 60056     | Visa             | 1111222233334444 | 12/22          | John Wick        |
      | FamilyAlbum | 3        | Tony Stark       | Iron Man Dr      | LA        | CA    | 30303     | MasterCard       | 1313131313131313 | 10/30          | Tony Stark       |
      | MyMoney     | 2        | Steve Rogers     | Captain Dr       | LA        | CA    | 10101     | American Express | 1234123412341234 | 01/03          | Steve Rogers     |
      | ScreenSaver | 2        | Anakin Skywalker | Hate Sand Street | Tatooine  | TA    | 123456789 | Visa             | 0123456789101112 | 03/03          | Anakin Skywalker |
      | ScreenSaver | 1        | Andy             | Old Guards Ave   | Somewhere | IDK   | 31313     | MasterCard       | 0123212332123210 | 01/01          | Andy             |
      | FamilyAlbum | 2        | Neo              | NoWhere Ave      | Matrix    | M     | 999999999 | MasterCard       | 9999999999999999 | 12/31          | Neo              |
      | FamilyAlbum | 2        | Trinity          | NoWhere Ave      | Matrix    | M     | 999999999 | MasterCard       | 9999999999999999 | 12/31          | Trinity          |
