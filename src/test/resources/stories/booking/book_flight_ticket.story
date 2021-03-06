Meta:

Narrative:
As a user
I want to book a flight
So that I can travel for my holidays

Scenario: scenario description
Given a user is on the flight booking application
And the user logs in with <username> and <password>
When user selects journey details <journeyType>  <depart>  <arrive>  <classType>
And provide personal and card details <firstname> <lastName> <creditCardNumber>

Examples:
username |password |journeyType | depart | arrive | classType  |firstName | lastName | creditCardNumber |
mercury  |mercury  |One Way     | Sydney | London | First Class | mercury |mercury   | 123456789 |
