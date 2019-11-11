import java.util.Scanner;

public class newApp {

	public static void main(String[] args) {

		Scanner Keyboard = new Scanner(System.in);
		System.out.println("To begin turn on the remote control");
		String turnOn = Keyboard.next();
		if (turnOn == On) {
			pressButton();
		}
		pressButton();
		remoteOff();

	}

	public static void pressButton();

	{
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Turning On");
		System.out.println("BOOP");
		System.out.println("Select a number 0 through 9, or Off to exit remote.");
		Switch choice = Keyboard.next();
		while (choice <= 9)
			switch (choice) {
				case "0":
					System.out.println("Beep " + 0 + "choose again or push Off to exit remote");
					pressButton();
				case "1":
					System.out.println("Beep " + 1 + "choose again or push Off to exit remote");
				case "2":
					System.out.println("Beep " + 2 + "choose again or push Off to exit remote");
				case "3":
					System.out.println("Beep " + 3 + "choose again or push Off to exit remote");
				case "4":
					System.out.println("Beep " + 4 + "choose again or push Off to exit remote");
				case "5":
					System.out.println("Beep " + 5 + "choose again or push Off to exit remote");
				case "6":
					System.out.println("Beep " + 6 + "choose again or push Off to exit remote");
				case "7":
					System.out.println("Beep " + 7 + "choose again or push Off to exit remote");
				case "8":
					System.out.println("Beep " + 8 + "choose again or push Off to exit remote");
				case "9":
					System.out.println("Beep " + 9 + "choose again or push Off to exit remote");

			}
	}

	public static void remoteOff() {
		System.out.println("Turning Off");
	}

}
