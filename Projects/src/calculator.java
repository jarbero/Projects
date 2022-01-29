import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		printMenu();
		i = sc.nextInt();
		double num1;
		double num2;
		double num3;
		
		switch(i) {
		case 1: 
			System.out.println("Enter first num: ");
			num1 = sc.nextDouble();
			System.out.println("Enter second num: ");
			num2 = sc.nextDouble();
			num3 = num1 + num2;
			System.out.println("Sum of nums: " + num3 + "\n");
			run();
			break;
		case 2:
			System.out.println("Enter first num: ");
			num1 = sc.nextDouble();
			System.out.println("Enter second num: ");
			num2 = sc.nextDouble();
			num3 = num1 - num2;
			System.out.println("Difference of nums: " + num3 + "\n");
			run();
			break;
		case 3:
			System.out.println("Enter first num: ");
			num1 = sc.nextDouble();
			System.out.println("Enter second num: ");
			num2 = sc.nextDouble();
			num3 = num1/num2;
			System.out.println("Division of nums: " + num3 + "\n");
			run();
			break;
		case 4:
			System.out.println("Exited. Thank you for using [Jared Calculator :)]\n");
			break;
		default:
			System.out.println("ERROR: Enter a number between (1-4)\n");
			run();
			break;
		}
	}
	
	public static void printMenu() {
		System.out.println("Choose an option:" + 
							"\n1: Addition"  +
							"\n2: Subtraction" + 
							"\n3: Division" + 
							"\n4: Exit");
	}
}
