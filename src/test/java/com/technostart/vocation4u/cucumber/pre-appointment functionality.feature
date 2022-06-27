Feature: pre-appointment functionality


Scenario Outline: As a specialist I want to be able to cancel an appointment.

Given  I am in the "scheduled appointments" section
And select the button to cancel appointment
Then  I should see a confirmation message. <message>

Examples:
  |	message			  	  |
  | “successfully canceled appointment” |


Scenario Outline: As a specialist I want to be able to cancel an appointment.

Given  I am in the "scheduled appointments" section
And  select the button to cancel appointment
Then I see an error  <error>

Examples:
	| error		|
	| “ No se puede cancelar una cita próxima a empezar” |
