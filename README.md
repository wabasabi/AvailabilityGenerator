# AvailabilityGenerator
This application will allow a user to use a GUI interface to generate an availability of their work hours for a 7 day work week.

The application is being written in Java version 7 by Steven Gantz and Ryan Harrington using IntelliJ IDEA on Windows. 

Future Features:
- Allow ability to set days and times that are off limits.
- Set specific dates for each week
- Declare a due date at the top
- Add user's name as part of excel file
- Directly send email to user
  - "Enter password for application's email"
  - "Enter email address of recipient"

GUI -> Data goes into Data Access Object -> used by -> Availability Generator (Gen takes DAO as parameter)
  - Availability Generator is invoked on "Write local csv file" or "Send email" buttons.
