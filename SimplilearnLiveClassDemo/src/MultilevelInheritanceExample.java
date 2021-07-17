class Animal{
	void eat() {
		System.out.println("The Animal eats.");
	}
}
class Dog extends Animal{
	void sleep() {
		System.out.println("The Dog sleeps."); //sleep(); eat();
		
	}
}
class BabyDog extends Dog{
	void bark() {
		System.out.println("The baby do barks."); //bark(); sleep(); eat();
	}
}
public class MultilevelInheritanceExample {
	public static void main(String[] args) {
		BabyDog babydog = new BabyDog();
		babydog.sleep();
		babydog.eat();
		babydog.bark();
	}

}
