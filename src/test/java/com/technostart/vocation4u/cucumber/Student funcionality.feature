Feature: Student funcionality
Scenario Outline: As a student I want to be able to reschedule an appointment.

	Given  I am in the scheduled appointments section
  And  I select the option to reschedule
  Then  I'll see the available times.

	Examples:
	|    message		    | Schedule		        |
	|” schedule available”	| 17:00 		20:00   |



Scenario Outline: As a student I want to be able to reschedule an appointment.

	Given I am in the scheduled appointments section
  And select the option to reschedule
  Then no schedules appear and a see message of not available<message>

	Examples:
	|message		         |
	|”no times available”    |
