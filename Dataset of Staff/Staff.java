// package program_2a;

import java.util.Scanner;

public class Staff {
	int staffid;
	String name;
	long phone;
	int salary;
	
	Scanner scan = new Scanner(System.in);
	
	public void read() {
		System.out.println("Enter StaffId:\n");
		staffid = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Enter Name:\n");
		name = scan.nextLine();
		
		System.out.println("Enter Phone No:\n");
		phone = scan.nextLong();
		
		System.out.println("Enter the Salary:\n");
		salary = scan.nextInt();
		
	}
	
	public void display() {
		System.out.println("Staff Id: "+staffid);
		System.out.println("Name: "+name);
		System.out.println("Phoen No: "+phone);
		System.out.println("Salary: "+salary);
		
	}
	
}



















