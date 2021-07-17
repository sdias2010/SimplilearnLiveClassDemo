interface CalculatorSumandSub{
	int sum(int a, int b);
	int sub(int a, int b);
}
//interface CalculatorMulandDiv{
interface CalculatorMulandDiv extends CalculatorSumandSub{
	int mul(int a, int b);
	int div(int a, int b);
}
//class CalImp implements CalculatorMulandDiv, CalculatorSumandSub{
class CalImp_new implements CalculatorMulandDiv{
	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
}
public class InterfaceClassExample {
	public static void main(String[] args) {
		CalImp_new calimp = new CalImp_new();
		System.out.println(calimp.sum(3, 4));
		
	}

}
