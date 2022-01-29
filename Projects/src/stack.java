//CREATED BY JARED BARBERO 1-24-2022
//FULLY IMPLEMENTED STACK

import java.util.Scanner;

public class stack {
	int[] stack = new int[5];
	int count = 0;
	int userInput;
	
	public static void main(String[] args) {
		System.out.println("Created by Jared Barbero_o");
		stack print = new stack();
		print.printStack();
		print.selection();
	}
	
	public void push() {
		if(count < 5) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter num: ");
			userInput = sc.nextInt();
			System.out.println(stack[count] = userInput);
			count++;
			printStack();
		} else {
			System.out.println("Stack is full. ERROR.");
			selection();
		}
	}
	
	public void pop() {
		
		if(count > 0) {
			stack[count - 1] = 0;
			count--;
			printStack();
		}else{
			System.out.println("Stack is already empty. ERROR.");
		}
	}
	
	public void peek() {
		if(count <0) {
		System.out.println(stack[count -1]);
		}else {
			System.out.println("Stack is empty.");
		}
	}
	
	public void printStack() {
		
		System.out.println();
		System.out.println("STACK");
		for(int i = stack.length - 1 ; i >= 0 ; i--) {
			System.out.println( "|"+ stack[i] + "|");
		}
		
		System.out.print("---\n");
	}
	
	public void menu() {
		System.out.println(
				"\nEnter a choice between(1-4):"
				+ "\n1: Push\n"
				+ "2: Pop\n"
				+ "3: Peek\n"
				+ "4: Exit\n");
	}
	
	public void selection() {
		menu();
		
		int i;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		switch(i) {
		case 1:
			push();
			selection();
			break;
		case 2:
			pop();
			selection();
			break;
		case 3:
			peek();
			selection();
			break;
		case 4:
			System.out.println("Exited");
			break;
		default:
			System.out.println("Please enter a number between(1-4)");
			break;
		}
	}
}
