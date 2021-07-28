package prog4;

import java.util.Random;
import java.util.Scanner;

public class Quickmain {
	
	public static void main(String[] args) {
		int [] arr = new int[100];
		int n;
		
		Quicksort obj = new Quicksort();
		
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n = scan.nextInt();
		
		System.out.println("Random Elements:");
		for(int i = 0;i<n;i++) {
			arr[i] = r.nextInt(1000);
		}
		
		System.out.println("The array elements to be sorted are:");
		for(int i = 0;i<n;i++) {
			System.out.println("\n"+arr[i]);
		}
		
		long startTime = System.currentTimeMillis();
		obj.quicksortRecursion(arr, 0, n-1);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		
		System.out.println("The sorted elements are:\n");
		for(int i = 0;i<n;i++) {
			System.out.println("\n"+arr[i]);
		}
		
		System.out.println("Total time taken: "+totalTime+"ms");
		
		scan.close();
	}

}
