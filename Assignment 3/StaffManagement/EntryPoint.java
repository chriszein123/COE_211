import java.util.Scanner;
import java.util.Random;

public class EntryPoint {
	public static void main(String[] args) {
		Random rnd = new Random();
		final int d = rnd.nextInt(10) + 1;
		System.out.println("number = " + d);
		Scanner scan = new Scanner(System.in);

		for(int i=0; i<d; i++) {
			Employee employees = new Employee();

			
			System.out.println("Please input the employee's first name: ");
			employees.setFirstName(scan.nextLine());

			System.out.println("Please input the employee's last name: ");
			employees.setLastName(scan.nextLine());

			System.out.println("Please input the employee's age: ");
			employees.setAge(scan.nextInt());

			System.out.println("Please input the employee's monthly salary: ");
			employees.setMonthlySalary(scan.nextDouble());
			scan.nextLine();

			System.out.println(employees.EmployeeInfo());
			System.out.println("You have " + (d-i-1) + " insertions left.\n");
				
		}
	}
}
