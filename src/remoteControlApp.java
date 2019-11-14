
import java.util.Scanner;

public class remoteControlApp {

	public static void main(String[] args) {

		Scanner Keyboard = new Scanner(System.in);
		
		boolean on = true;
		while (on == true) {
			System.out.println("To begin turn on the remote control by typing On");
			String choice = Keyboard.next().toLowerCase();
			
			if (choice.equals("on")) {
				on = false;
				pressButton();
			}

			// Runs until true
		}

	}

	public static void pressButton() {

		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Turning On");
		System.out.println("BOOP");
		boolean stayOn = true;
		while (stayOn == true) {

			System.out.println("Select a number 0 through 9, or Off to exit remote.");
			String choice = Keyboard.next();
			switch (choice) {
				case "0":
					System.out.println("Beep " + 0 + " choose again or push Off to exit remote");
					break;
				case "1":
					System.out.println("Beep " + 1 + " choose again or push Off to exit remote");
					break;
				case "2":
					System.out.println("Beep " + 2 + " choose again or push Off to exit remote");
					break;
				case "3":
					System.out.println("Beep " + 3 + " choose again or push Off to exit remote");
					break;
				case "4":
					System.out.println("Beep " + 4 + " choose again or push Off to exit remote");
					break;
				case "5":
					System.out.println("Beep " + 5 + " choose again or push Off to exit remote");
					break;
				case "6":
					System.out.println("Beep " + 6 + " choose again or push Off to exit remote");
					break;
				case "7":
					System.out.println("Beep " + 7 + " choose again or push Off to exit remote");
					break;
				case "8":
					System.out.println("Beep " + 8 + " choose again or push Off to exit remote");
					break;
				case "9":
					System.out.println("Beep " + 9 + " choose again or push Off to exit remote");
					break;

				default:
					System.out.println("Error choose a number 1 - 0 or Off to exit remote");
					pressButton();
					break;
				case "off":
					stayOn = false;
					remoteOff();

					Keyboard.close();
					
			}

		}

	}

	public static void remoteOff() {
		System.out.println("Turning Off");
	}
}
