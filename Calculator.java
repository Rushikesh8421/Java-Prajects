//Write a Java program to perform basic Calculator operations.
//When you think about a calculator, operations like addition, subtraction, 
//multiplication, and division comes into the mind. Let’s implement the basic 
//calculator operations with the help of the below program.

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Calci c = new Calci();
		c.cal();

	}

}

class Calci{
	public void cal() {
		int a, b, choice, result = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Enter the value of a");
			a = scan.nextInt();
			System.out.println("Enter the value of b");
			b = scan.nextInt();
			System.out.println("...Menu...");
			System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n"+
			"4.Division\n5.Exit");
			System.out.println("Enter the choice");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1: result = a+b;
				break;
			case 2: result = a-b;
				break;
			case 3: result = a*b;
				break;
			case 4: result = a/b;
				break;
			case 5: System.out.println("Thanks for visiting!");
				break;
			default: System.out.println("Please enter the valid key\n");
				break;
			}
			System.out.println("The result is: "+result);
			
		}while(choice != 5);
		
		scan.close();
	}
}










