package patterns;

import java.util.Scanner;

public class PatternA {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of rows: ");
		n = scan.nextInt();
		for(int i = 0;i<=n;i++) {
			for(int j = 0;j<=n/2;j++) {
				if(((j == 0||j==n/2) && i != 0)||(i==0&&j!=0&&j!=n/2)||(i==n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
