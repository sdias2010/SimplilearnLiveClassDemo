class College{
	int regno;
	String name;
//	String coll_name;
	static String coll_name = "IIT";
	
/*	public College(int regno, String name, String coll_name) {
		this.regno = regno;
		this.name = name;
		this.coll_name = coll_name;
	}
	
	void change(String coll_name) {
		this.coll_name = coll_name;
	}
	
	void display() {
		System.out.println(regno + " " + name + " " + coll_name);
	}
*/	
	
	//Code for Static variable
//	public College(int regno, String name) {
//		this.regno = regno;
//		this.name = name;
//	}
//	
//	void display() {
//		System.out.println(regno + " " + name + " " + coll_name);
//		
//	}
	
	//Code for static method
	public College(int regno, String name) {
		this.regno = regno;
		this.name = name;
	}
	static void display() {
		System.out.println(coll_name);
	}
	
}
public class CollegeMain {
	public static void main(String[] args) {
//		College college = new College(201, "Ram", "BIT");
//		college.change("NIT");
//		college.display();
		
		//for static variable
//		College college_static = new College(301, "Sham");
//		college_static.display();
		
		//for static method
		String display;
		College col_static_method = new College(401, "Dam");
		System.out.println(col_static_method.regno + "  " + col_static_method.name);
		College.display();
	}

}
