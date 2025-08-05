package testproject;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//implicit Typecasting 
		short c = 19;
		int a = c;
		float b = 3;
		double d = b;
		System.out.println(c);
		
		int w=99;
		short x=(short)w;
		System.out.println(x);
		
		double y=88.0000;
		float z=(float)y;
		System.out.print(z);
	}
}