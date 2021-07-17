class Poly{
	void display() {
		System.out.println("This method has no arguments.");
	}
	void display(int a) {
		System.out.println("This method has one argument.");
	}
	void display(int a, int b) {
		System.out.println("This method has two arguments with int.");
	}
	void display(float a, float b) {
		System.out.println("This method has tow arguments with float.");
	}
}
public class OverloadingExample {
	public static void main(String[] args) {
		//double a = 5;
		//int b = (int)a; //TypeCasting
		Poly p = new Poly();
		p.display(7);
	}

}
