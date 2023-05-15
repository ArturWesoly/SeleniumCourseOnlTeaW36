Feature: Add New Address
  Scenario Outline: Successful add new address
    Given Page https://mystore-testlab.coderslab.pl opened in browser
    When Login account
    And Click add new address
    And Click create new address
    And Fill "<alias>" in form
    And Fill in form "<address>"
    And Add "<city>" in form
    And Add in form "<zip/postal code>"
    And Fill form "<country>"
    And Add "<phone>"


    Examples:
    | alias     | address |  city  | zip/postal code | country         | phone        |
    | Prymus    | Maya 1  | Poznan |  60-658         |  United Kingdom | 666-666-666  |

