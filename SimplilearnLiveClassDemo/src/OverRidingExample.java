class Dog1{
	void bark() {
		System.out.println("The Dog barks.");
	}
}
class SmallDog extends Dog1{
	void bark() {
		System.out.println("The small dog barks.");
	}
}
public class OverRidingExample {
	public static void main(String[] args) {
		SmallDog sd = new SmallDog();
		sd.bark();
	}

}
