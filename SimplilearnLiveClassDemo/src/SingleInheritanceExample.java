class Bank{
	double rateOfInterest = 7.8;
	
}

class HDFC extends Bank{
	void interestAmount(double amount) {
		double interestamount = (amount * rateOfInterest) / 100;
		System.out.println("Interest Amount - " + interestamount);
	}
}
public class SingleInheritanceExample {
	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.interestAmount(100000);
	}

}
