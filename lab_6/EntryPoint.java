import java.util.Scanner;

public class EntryPoint {
	public static void main (String[] args) {
		String loop = "";
		Scanner scan = new Scanner(System.in);

		do { 
			System.out.println("Which service would you like to use?\n[1]: Basic week visualizer\n[2]: Advanced week visualizer\n[3]: Basic calculator\n[4]: Employee repertoire");

		int idx= scan.nextInt();

			while (idx < 1 || idx > 4){
				System.out.println("Please make sure you pick a number between 1 and 4");
			idx = scan.nextInt();
			}

			 switch (idx) {
				case 1:
				BasicWeek week1 = new BasicWeek();
				week1.printDays();
				break;
			
				case 2:
				AdvancedWeek week2 = new AdvancedWeek();
				week2.printDays();
				break;

				case 3:
				Calculator calc = new Calculator();
				break;
	
				case 4:
				Employee emp = new Employee();		
				break;

			}
		System.out.println("Would you like to perform another operation? (y/n)");
		scan.nextLine();
		loop = scan.nextLine();
		} while (loop.equalsIgnoreCase("y"));

				

	}
}