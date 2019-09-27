Feature: As a potential client i need to search in wikipedia to find a few definitions

  @Wikipedia @Smoke
  Scenario Outline: 01 - The client search in wikipedia page
    Given the user is in wikipedia page
    When the user search for <word>
    Then the <word> is searched correctly

    Examples:
      | word |
    |Cryptocurrency |