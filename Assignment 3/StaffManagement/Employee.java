public class Employee {
	private String firstName, lastName;
	private int age;
	private double monthlySalary;

	public Employee (){
		firstName = "";
		lastName = "";
		age = 0;
		monthlySalary = 0;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
		
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}

	public String EmployeeInfo() {
		return "Employee information: " + firstName + " " + lastName + ", " + age + ", " + monthlySalary;
	}

}