package JavaProgramm;

import java.util.Scanner;

public class SimpleCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		double a=sc.nextDouble();
		System.out.println("Enter second number");
		double b= sc.nextDouble();
		System.out.println("Enter operation (+, -, *, /): ");
		char operator= sc.next().charAt(0);
		double result;
		
		switch (operator) {
		case '+': result= a+b;	break;
		case '-': result= a-b;  break;
		case '*': result= a*b;  break;
		case '/': result= a/b;  break;

		default: throw new IllegalArgumentException("Invalid operations");
			
		}
		
		System.out.println("Result : "+ result);
		
	}

}
