import java.io.*;
import java.util.Scanner;

public class ExpensesTracker{
	public static void main(String[] args){
  
	try {
		String repeat = "y";
		String khwan = "y";
		String name = "";
		String purchase = "";
		String log;
		double price = 0;

		FileWriter fw = new FileWriter(new File("expenses.txt"));
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outToFile = new PrintWriter(bw);

		Scanner fileScan = new Scanner(new File("expenses.txt"));
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Input your name: ");
			name = scan.nextLine();
			System.out.println("What did you purchase?");
			purchase = scan.nextLine();
			System.out.println("How much did you pay? (in USD)");
			price = scan.nextDouble();
			scan.nextLine();
			outToFile.println(name + " purchased " + purchase + " for " + price + " US Dollars.");
			System.out.println("Would you like to log another purchase? (y/n)");

			repeat = scan.nextLine();
		} while (repeat.equalsIgnoreCase("y"));

		System.out.println("Would you like to read a summary of your purchases? (y/n)");
		khwan = scan.nextLine();
		outToFile.close();
		scan.close();
		if(khwan.equalsIgnoreCase("y")) {
			while(fileScan.hasNext()) {
				log = fileScan.nextLine();
				System.out.println(log);
			}
		}

	} catch (IOException e) {
		System.out.println("An error occurred.");
		e.printStackTrace();
		}
	}
}