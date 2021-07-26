package patterns;

import java.util.Scanner;

public class Daimond {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of rows: ");
		n = scan.nextInt();
		for(int i=1;i<n;i++) {
			for(int j=n-2;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();

	}

}
