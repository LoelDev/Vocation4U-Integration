Feature:Specialist functionality

Scenario Outline: As a specialist  I want to register with my phone number.

	Given  I can sign up as a specialist
	And  I sending specialist to be created with specialist <id>
	Then  I should be able to see my newly created specialist
	Examples:
	|id |
	| 1 |


Scenario Outline: As a specialist I want to register with my phone number.

Given I am in the section to register my data
And  I register a duplicate mobile number
Then I will be shown an error message <error>
	Examples:
		|           error              |
        |"The number is already in use"|
