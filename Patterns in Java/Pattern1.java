package patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of rows: ");
		n = scan.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j = n;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		scan.close();
	}

}
