// Fibonacii series using Recursion
package firstprog;

import java.util.Scanner;

public class Fibonacii {
	static int a = 0, b = 1, c, n;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n = scan.nextInt();
		System.out.print(a+" "+b);
		Fibonacii ob = new Fibonacii();
		ob.fab(n);
		scan.close();
		
	}
	
	public void fab(int n) {
		if(n>=1) {
			c = a+b;
			System.out.print(" "+c);
			a = b;
			b = c;
			fab(n-1);
			
		}
	}

}











