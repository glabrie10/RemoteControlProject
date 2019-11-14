## Remote Control Project
This application simulates a remote control.  It functions of prompted user interface.  The remote has On and Off functionality as well as the ability to push choose o, through 9.  All choices must input to work.   

When the user starts the program, it will print an initial message asking for input.  If the user inputs anything other than ON, the initial message repeats itself ON is entered.  Once on is typed by the user, an output message of "Turning On" will be displayed.  

Once the user turns ON the output message "Turning On"  will displayed, followed by the message "Boob."  The program will now ask the user to enter 0 through 9 or Off.  When 0 through 9 is entered the number will be displayed and the user will be prompted to enter another input endlessly until off is entered. Depending on the user choice different messages will be displayed.  

One message for input an input 0 through 9; "Beep " + 0 + " choose again or push Off to exit remote".  One message for an incorrect input, ("Error choose a number 1 - 0 or Off to exit remote").  When off is entered "turning off" will be displayed and the Remote Control app will end.

### Week 1 Homework for Skill Distillery

#### Overview
This application simulates a remote control.  It functions of prompted user interface.  The remote has On and Off functionality as well as the ability to push choose o, through 9.  All choices must input to work.   

When the user starts the program, it will print an initial message asking for input.  If the user inputs anything other than ON, the initial message repeats itself ON is entered.  Once on is typed by the user, an output message of "Turning On" will be displayed.  

Once the user turns ON the output message "Turning On"  will displayed, followed by the message "Boob."  The program will now ask the user to enter 0 through 9 or Off.  When 0 through 9 is entered the number will be displayed and the user will be prompted to enter another input endlessly until off is entered. Depending on the user choice different messages will be displayed.  

One message for input an input 0 through 9; "Beep " + 0 + " choose again or push Off to exit remote".  One message for an incorrect input, ("Error choose a number 1 - 0 or Off to exit remote").  When off is entered "turning off" will be displayed and the Remote Control program will end.

#### Concepts
The program was written entirely in the main method.  TO start Scanner was imported and set to keyboard for user input.  Boolean was used in parallel with a while loop to create an infinite user prompt to push on.  Once On was pushed the while loop ended.  

Upon the user input of "on" another method "pressButton()" started.  In this method another boolean was paired with a while loop to run the switch in an infinite loop until the user enters the off.  Once off is input the "remoteOFF" method is called and the remote control program ends.

#### Technologies Used
Eclipse
java
atom
github

#### Lessons Learned
To run an infinite while loop it is easiest to pair it with a boolean.
