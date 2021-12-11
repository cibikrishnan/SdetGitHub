Feature: Data table demo

  @demo
  Scenario: data table for login
    Given user enters the credentials
      | username  | password |
      | ckrishnan | pwd      |
      | ram       | rampwd   |

  @demo
  Scenario: data for fields
    When I enter valid data on the page
      | Fields                 | Values              |
      | First Name             | Tom                 |
      | Last Name              | Kenny               |
      | Email Address          | someone@someone.com |
      | Re-enter Email Address | someone@someone.com |
      | Password               | Password1           |
      | Birthdate              | 01                  |

