// if-else statement
package testproject;
import java.util.Scanner; //used for the input at the runtime 

//public class ConditionalDemo {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in); //taking input from user
//		System.out.println("Enter a number"); 
//		int a = sc.nextInt(); 
//		
//		if (a>=10) {
//			System.out.println("Positive Integer");
//		}
//		else {
//			System.out.println("Negative Integer");
//		}
//	}
//}

// Switch case statements


public class ConditionalDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //taking input from user
		System.out.println("Enter the age"); 
		int age = sc.nextInt(); 
		age = 18;
		
		if (age <= 12) {
			System.out.println("Minor Citizen");
		}
		else if (age >= 13 && age <= 19) {
			System.out.println("Teenager Citizen");
		}
		else if (age >= 20 && age <= 25) {
			System.out.println("Adult Citizen");
		}
		else if (age >= 25 && age <= 50) {
			System.out.println("Parent Citizen");
		}
		else {
			System.out.println("Senior Citizen");
		}
	}
}

