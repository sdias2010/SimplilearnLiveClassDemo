class Vehicle{
	int speed = 100;
	void displayspeed() {
		System.out.println(speed);
	}
}

class Bike extends Vehicle{
	int speed = 100;
	void displayspeed() {
		super.displayspeed(); //overriding the parentclass method
		//System.out.println(speed);
	}
}
public class SuperKeywordExample {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.displayspeed();
	}

}
