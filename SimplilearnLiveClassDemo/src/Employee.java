
public class Employee {
	int employee_no;
	double employee_salary;
	String employee_name;
	
	//Method with void
/*	public void increaseSalary(double bonus) {
		double employee_newsalary;
		employee_newsalary = employee_salary + bonus;
		System.out.println("Salary with Bonus - " + employee_newsalary);		
	}
*/	
	//Method with return type
/*	public double increaseSalary(double bonus) {
		double employee_newsalary;
		employee_newsalary = employee_salary + bonus;
		return employee_newsalary;		
	}
*/
	//Constructor 1
//	public Employee() {
//		System.out.println("Employee Salary - " + employee_salary);
//	}
	
	//Constructor 2
//	public Employee(double bonus) {
//		System.out.println("Employee Salary - " + (employee_salary+bonus));
//	}
	
	//Constructor this keyword
//	public Employee(int employee_no, String employee_name, double employee_salary ) {
//		this.employee_no = employee_no;
//		this.employee_name = employee_name;
//		this.employee_salary = employee_salary;
//	}
	
	//Method to display the values in the constructor
//	void display() {
//		System.out.println(employee_no + "  " + employee_name + "  " + employee_salary);
//	}
}
