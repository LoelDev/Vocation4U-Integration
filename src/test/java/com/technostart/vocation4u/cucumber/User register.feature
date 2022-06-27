Feature: User register

Scenario Outline: As a Student  i want to register with my email.

	Given  I am in the register seccion
	And  register with id <id> and email
	Then  I should be able to register
	Examples:
	|id	|
	| 1	|

Scenario Outline: As a Student  I want to see an error if the email is in use.

	Given  I am in the register section
	And  register a repeat email
	Then  I should see a message <errors>
	Examples:
	|error                |
    |"The email is in use"|
