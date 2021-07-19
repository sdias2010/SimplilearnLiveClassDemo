class AgeValidaiton{
	void ageVerify(int age) throws AgeInvalidException{
		if(age >= 18) {
			System.out.println("Has right to vote.");
		}else {
			throw new AgeInvalidException("No right to vote.");
		}
	}
}
public class ThrowExceptionExample {
	public static void main(String[] args) throws AgeInvalidException {
		AgeValidaiton av = new AgeValidaiton();
		av.ageVerify(8);
		
	}

}
