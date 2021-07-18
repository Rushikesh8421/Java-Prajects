// package program_2a;

public class Contract extends Staff{
	int period;
	
	public void read() {
		super.read();
		System.out.println("Contract Period: ");
		period = scan.nextInt();
		
	}
	
	public void display() {
		super.display();
		System.out.println("Contract Period: "+period);
	}
}
