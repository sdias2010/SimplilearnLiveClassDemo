class Animalnew{
	void eat() {
		System.out.println("The Animal eats.");
	}
}
class Dognew extends Animalnew{
	void sleep() {
		System.out.println("The Dog sleeps."); //sleep(); eat();
		
	}
}
class BabyDognew extends Animalnew{
	void bark() {
		System.out.println("The baby do barks."); //bark(); sleep(); eat();
	}
}
public class HierarchicalInheritanceExample {
	public static void main(String[] args) {
		BabyDognew babydog = new BabyDognew();
		babydog.eat();
		babydog.bark();
	}

}
