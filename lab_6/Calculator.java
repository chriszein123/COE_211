import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

	public Calculator() {
        Scanner scanCalc = new Scanner(System.in);

	System.out.println("Input the first number: ");
	int num1 = scanCalc.nextInt();
	System.out.println("Input the operator: ");
	String empty = scanCalc.nextLine();
	String operator = scanCalc.nextLine();
	System.out.println("Input the second number: ");
	int num2 = scanCalc.nextInt();

	switch (operator) {
		case "+":
		System.out.println(add(num1, num2));
		break;

		case "-":
		System.out.println(subtract(num1, num2));
		break;

		case "*":
		System.out.println(multiply(num1, num2));
		break;

		case "/":
		System.out.println(divide(num1, num2));
		break;
	}
	}

	public String add(int a, int b) {
		return (a + " + " + b + " = " + (a+b));
	}

	public String subtract(int a, int b) {
		return (a + " - " + b + " = " + (a-b));
	}

	public String multiply(int a, int b) {
        	return (a + " * " + b + " = " + (a*b));
	}

	public String divide(int a, int b) {
		return  (a + " / " + b + " = " + (a/(double) b));
	}
}