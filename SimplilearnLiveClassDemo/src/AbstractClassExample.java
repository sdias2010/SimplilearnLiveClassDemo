abstract class Calculator{
	abstract int sum(int a, int b);
	abstract int sub(int a, int b);
}
class CalImp extends Calculator{

	@Override
	int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
}
public class AbstractClassExample {
	public static void main(String[] args) {
		CalImp ci = new CalImp();
		System.out.println(ci.sum(2, 3));
		System.out.println(ci.sub(9, 7));
	}
	
}
