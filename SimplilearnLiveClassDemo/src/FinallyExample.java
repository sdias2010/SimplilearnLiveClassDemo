
public class FinallyExample {
	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int a = 50/2;
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Simplilearn");
		}
		System.out.println("Hello");
	}

}
