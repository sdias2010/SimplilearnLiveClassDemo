public class TryCatchExample {
	public static void main(String[] args) {
		System.out.println("hi");
		try {
			int a = 5/0;
		}catch(Exception e) {
			System.out.println(e); //exception object
		}
		System.out.println("hello");
	}

}
