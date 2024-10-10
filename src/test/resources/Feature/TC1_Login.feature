
Feature: Verifying OMRBranch Hotel Login Module
@Login
  Scenario Outline: Verifying login with valid credentials without Enter Key
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prashanth"

    Examples: 
      | userName                 | password   |
      | prashanth83362@gmail.com | Shiva@1234 |

  Scenario Outline: Verifying login with valid credentials with Enter Key using Robot Class
    Given User is on the OMR Branches hotel page
    When User login "<userName>" and "<password>" with enter key
    Then User should verify success messages after login "Welcome Prashanth"

    Examples: 
      | userName                 | password   |
      | prashanth83362@gmail.com | Shiva@1234 |

  Scenario Outline: Verifying login with invalid credentials
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify error message after login "Invalid Login details or Your Password might have expired."

    Examples: 
      | userName                 | password   |
      | prashanth83362@gmail.com | Hello@3456 |
