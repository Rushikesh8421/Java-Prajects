// package program_2b;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Customer {
	String name, date;
	Scanner scan = new Scanner(System.in);
	public void readDate() {
		System.out.println("Enter the name of the Customer: ");
		name = scan.nextLine();
		System.out.println("Enter the date of birth of Customer: ");
		date=  scan.nextLine();
	}
	
	public void dispalyData() {
		System.out.println("Tokenized");
		StringTokenizer st = new StringTokenizer(date,"/");
		System.out.print(name);
		while(st.hasMoreTokens()) {
			System.out.print(","+st.nextToken());
		}
	}

    public static void main(String[] args) {
		Customer cus = new Customer();
		cus.readDate();
		cus.dispalyData();
        System.out.println();

	}

}
