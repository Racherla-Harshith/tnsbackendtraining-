package testproject;

import java.util.Scanner;

public class CondtionalBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value");
		int a = sc.nextInt();
		System.out.println("Enter b Value");
		int b = sc.nextInt();
		System.out.println("Enter the Operator");
		int operator = sc.nextInt();
		
		switch(operator) {
		case 1 : System.out.println(a+b);
	    break;
	    case 2 : System.out.println(a-b);
	    break;
	    case 3 : System.out.println(a*b);
	    break;
	    default : System.out.println("Invalid operator!");
		}	
	}
}	        
