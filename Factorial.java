package firstprog;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n:");
		n = scan.nextInt();
		Fact f = new Fact();
		int r = f.loop(n);
		System.out.println(r);
		scan.close();
		

	}

}

class Fact{
	public int loop(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		return n*loop(n-1);
	}
	
}
