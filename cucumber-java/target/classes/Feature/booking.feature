Feature: Booking

Scenario Outline: Booking is successfull


Given Enter <name>
And Place
When user click book
Then Ticket should be booked

Examples:
| name |
| nandha |

