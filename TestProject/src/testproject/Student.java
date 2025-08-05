// Alternative of varibles
package testproject;

public class Student {
	//instance variable without assigning values to it using equal
	int rollno;
	String name;
	String branch;
	
	//static variable 
	static String collegename = "KPRIT";
	void display() {
		System.out.println("The details of the student is " + rollno + " "+name + " "+branch +" " + collegename);
	}
		
	//This main method input is given by the user to generate the output user required
	public static void main(String[] args) {
		Student ob = new Student();
		ob.rollno = 101;
		ob.name = "harsheys";
		ob.branch = "CSE";
		ob.display();
			
		Student obj = new Student();
		obj.rollno = 102;
		obj.name = "ananya";
		obj.branch = "CSE";
		obj.display();
	}
}