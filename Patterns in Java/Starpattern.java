package patterns;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		n = scan.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		scan.close();

	}

}
