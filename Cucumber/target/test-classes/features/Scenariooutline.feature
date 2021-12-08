Feature: Scenario outline

  Scenario Outline: Outline
    Given I am on FB page also
    Then I enter <username> and <password>
    Then I close browser

    Examples: 
      | username | password |
      | madhu    | Kiran    |
      | schmph   | jiji     |
