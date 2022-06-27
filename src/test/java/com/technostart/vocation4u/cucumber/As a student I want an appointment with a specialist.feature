Feature:As a student I want an appointment with a specialist	

Scenario Outline: As a Student I want to make an appointment with a specialist.

Given  I am in the profile of the specialist
And  select an available time
Then  I will see a confirmation message with specialist <specialist>, time <time>

	Examples:
	| specialist	       | time  |
	| “name_specialist”  | 18:00 |


Scenario Outline: As a Student I want to make an appointment with a specialist.

Given I am in the profile of the specialist
And I can't select a time
Then I will see an availability error message <availabity_error>.

	Examples:
	| availability_error               |
    | “ The specialist is not available|

