import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class StudentInfo{
	private int regno;
	private String name;
	private String email;
	public StudentInfo(int regno, String name, String email) {
		super();
		this.regno = regno;
		this.name = name;
		this.email = email;
	}
	public int getRegno() {
		return regno;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	
}
public class CollectionExample2 {
	public static void main(String[] args) {
		//taking input from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the regno:- ");
		int regno = sc.nextInt(); //take input from keyboard in Integer
		System.out.println("Enter the name:- ");
		String name = sc.next(); 
		System.out.println("Enter the email:- ");
		String email = sc.next();		
		
		StudentInfo s1 = new StudentInfo(101, "John", "john@test.com");
		StudentInfo s2 = new StudentInfo(102, "James", "james@test.com");
		StudentInfo s3 = new StudentInfo(103, "Jack", "jack@test.com");
		StudentInfo s4 = new StudentInfo(regno, name, email);
		
		//either use <wrapper class> or <user defined class> 
		//In this case we have used user defined class
		ArrayList<StudentInfo> al = new ArrayList<StudentInfo>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Iterator<StudentInfo> i = al.iterator();
		while(i.hasNext()) {
			StudentInfo s = (StudentInfo) i.next();
			System.out.println(s.getRegno() + "  " +s.getName() + "  "+s.getEmail());
		}
		
		
	}

}
