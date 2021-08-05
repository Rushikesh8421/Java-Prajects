//Find the Union and Intersection of the two sorted arrays.

package print.union.intersection;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [] arr1 = new int[10];
		int [] arr2 = new int[10];
		int m,n;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array 1:");
		m = scan.nextInt();
		System.out.println("Enter the elements of array 1:");
		for(int i=0;i<m;i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.println("Enter the size of array 2:");
		n = scan.nextInt();
		System.out.println("Enter the elements of array 2:");
		for(int i=0;i<n;i++) {
			arr2[i] = scan.nextInt();
		}
		
		Union un = new Union();
		Intersection inter = new Intersection();
		System.out.println("The Union of arrays is:");
		un.app(arr1, arr2, m, n);
		System.out.println();
		System.out.println("The Intersection of arrays is:");
		inter.intr(arr1, arr2, m, n);
		scan.close();
	}

}
