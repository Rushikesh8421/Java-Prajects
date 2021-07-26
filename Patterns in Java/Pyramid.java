package patterns;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of rows: ");
		n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=n-1;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	}

}
