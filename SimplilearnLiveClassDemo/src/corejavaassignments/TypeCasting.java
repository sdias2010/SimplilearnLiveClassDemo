package corejavaassignments;

public class TypeCasting {
	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		
		char a = 'A';
		System.out.println("Char value of a = " +a);
		
		int b = a;
		System.out.println("Int value of b = " +b);
		
		long c = a;
		System.out.println("Long value of c = " +c);
		
		float d = a;
		System.out.println("Float value of d = " +d);
		
		double e = a;
		System.out.println("Double value of e = " +e);
		
		System.out.println("\nExplicit Type Casting");
		
		double x = 39.588;
		System.out.println("Double value of x = " +x);
		
		float z = (float) x;
		System.out.println("Float value of z = " +z);
		
		int y = (int) x;
		System.out.println("Int value of y = " +y);
		
		
	}

}
