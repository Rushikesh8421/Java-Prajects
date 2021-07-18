// package program_2a;

public class Staffmain {

	public static void main(String[] args) {
		Teaching teach = new Teaching();
		Technical tech = new Technical();
		Contract cont = new Contract();

		System.out.println("Enter Teaching Staff Details");
		teach.read();
		
		System.out.println("Enter Technical Staff Details");
		tech.read();
		
		System.out.println("Enter the contract staff details");
		cont.read();
		
		System.out.println("Here is teaching staff details:");
		teach.display();
		
		System.out.println("Here is technical staff details:");
		tech.display();
		
		System.out.println("Here is contract staff details:");
		cont.display();
	}

}










