import java.util.Scanner;

import java.util.Scanner;

public class remoteControlApp {

  public static void main(String[] args) {
	  initial();
	  pressButton();
	  
  }
 

public static void initial();{
	Scanner Keyboard = new Scanner(System.in);
	System.out.println("To begin turn on the remote control");
	String turnOn = keyboard.next();
	if (turnOn == On) {
	pressButton)();
    	}
	else (turnOn != On) {
		initial();
	}
}

	
public static void pressButton();{
	System.out.println("Turning On");
	System.out.println("BOOP");
	System.out.println("Select a number 0 through 9, or Off to exit remote.");
	Switch choice = keyboard.nextdouble();
	if (choice <= 9)
	switch (choice) {
		case "0"
		System.out.println("Beep 0, choose again or push Off to exit remote");
		case "1"
		System.out.println("Beep 1, choose again or push Off to exit remote");
		case "2"
		System.out.println("Beep 2, choose again or push Off to exit remote");
		case "3"
		System.out.println("Beep 3, choose again or push Off to exit remote");
		case "4"
		System.out.println("Beep 4, choose again or push Off to exit remote");
		case "5"
		System.out.println("Beep 5, choose again or push Off to exit remote");
		case "6"
		System.out.println("Beep 6, choose again or push Off to exit remote");
		case "7"
		System.out.println("Beep 7, choose again or push Off to exit remote");
		case "8"
		System.out.println("Beep 8, choose again or push Off to exit remote");
		case "9"
		System.out.println("Beep 9, choose again or push Off to exit remote");
	}









	
}

   
    System.out.print("Enter another number: ");
    double num2 = input.nextDouble();
    System.out.print("What calculation do you want to do? ");
    String op = input.next();
    
    double result;
    switch (op) {
      case "+": case "add": case "plus":
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        break;
      case "-": case "subtract": case "minus": case "less":
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        break;
      case "*": case "multiply": case "times":
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        break;
      case "/": case "divide": case "over":
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
        break;
      case "%": case "mod": case "modulo":
        result = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + result);
        break;
      default:
        System.out.println("Operation not valid.");
    }
    
    input.close();
  }

}

		// TODO Auto-generated method stub
		
	



