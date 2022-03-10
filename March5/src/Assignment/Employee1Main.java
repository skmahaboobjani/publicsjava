package Assignment;

class Employee{
//	declare the variables
	
	int employeeId=100;
	String employeeName="mabu";
	double salary=500;
//	define the method
	
	void employeeinfo()
	{
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(salary);
	}
}




public class Employee1Main {

	public static void main(String[] args) {
//		create a object
		Employee em= new Employee();
//		call the method using reference
		em.employeeinfo();
	}

}
