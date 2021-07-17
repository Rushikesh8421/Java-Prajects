// some package
import java.util.Scanner;

public class Stackmain {

	public static void main(String[] args) {
		Stack s = new Stack();
		int ch;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("...Menu...\n");
			System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit\n");
			System.out.println("Enter the choice\n");
			
			ch = scan.nextInt();
			
			switch(ch) {
				
			case 1: s.push();
			break;
			
			case 2: s.pop();
			break;
			
			case 3: s.display();
			break;
			
			default: System.out.println("Invalid choice!");
			break;
			
			}
		}while(ch!=4);

	}

}











    

