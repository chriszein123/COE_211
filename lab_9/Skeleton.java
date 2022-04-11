import java.util.Scanner;

public class Skeleton {
	public static void main(String[] args) {
		int[] assGrade = new int[5];
		Scanner scan = new Scanner(System.in);
		int assSum = 0, attendance, midGrade;
		double assAvg, attAvg, midAvg;
		for(int i=0; i<=4; i++) {
			System.out.println("Input the grade of assignment " + (i+1));
			assGrade[i] = scan.nextInt();
			assSum += assGrade[i];
		}

		System.out.println();

		System.out.println("Input the number of attended labs");
		attendance = scan.nextInt();

		System.out.println();

		System.out.println("Input the midterm grade");
		midGrade = scan.nextInt();

		System.out.println();

		assAvg = assSum*(3.0/50);
		attAvg = attendance * (5.0/7);
		midAvg = midGrade * 0.3;

		System.out.println("Assignments (30%): " + assAvg);
		System.out.println("Attendance (5%): " + attAvg);
		System.out.println("Midterm (30%): " + midAvg);

		System.out.println();

		System.out.println("Your total grade without the final is: " + (assAvg + attAvg + midAvg));

		System.out.println();
		System.out.println("Thank you doctor 3a hal semester l helo");

	}
}