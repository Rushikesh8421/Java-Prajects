// package program_2a;

import java.util.Scanner;

public class Teaching extends Staff{
	String domain;
	int publication;
	
	Scanner scan = new Scanner(System.in);
	
	public void read() {
		super.read();
		System.out.println("Domain:\n");
		domain = scan.nextLine();
		System.out.println("Publication:\n");
		publication = scan.nextInt();
	}
	
	public void display() {
		super.display();
		System.out.println("Domain: "+domain);
		System.out.println("Publication: "+publication);
	}

}
