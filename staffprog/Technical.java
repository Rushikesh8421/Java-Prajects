package staffprog;

import java.util.Scanner;

public class Technical extends Staff {
	
	String [] skills;
	
	Scanner scan = new Scanner(System.in);
	
	public void  read() {
		super.read();
		System.out.println("Skill:");
		skills = scan.nextLine().split(",");
	}

	public void display() {
		super.display();
		System.out.println("skill:");
		for(int i=0;i<skills.length;i++) {
			System.out.println(skills[i]+" ");
		}
			
	}
}
