// Fibonacii series using while loop
package firstprog;

import java.util.Scanner;

public class Fibwhile {

	public static void main(String[] args) {
		int n, a = 0, b = 1, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n = scan.nextInt();
		while(a<=n) {
			System.out.print(a+" ");
			c = a+b;
			a = b;
			b = c;
		}
		scan.close();
	}

}
