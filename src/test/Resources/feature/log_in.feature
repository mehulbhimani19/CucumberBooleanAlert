Feature: Log in Guru 99
  @test
  Scenario Outline: As and admin i should be able log in with valid credentials
    Given I am on log in page
    When I enter valid "<username>" and "<password>"
#    Then I should be able to see homepage
    Then I should be able to see homepage"<result>"

     Examples:
    |username | password |result|
    | mngr54749|tEquzYn  |true|
#    |mngr54748 | basUzab |true|
#    |mngr54768 | byzygEt11 |true|


