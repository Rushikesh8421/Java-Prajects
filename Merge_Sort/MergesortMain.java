package program_5;

import java.util.Random;
import java.util.Scanner;

public class MergesortMain {

	public static void main(String[] args) {
		
		int [] arr = new int[1000];
		int n;
		
		Mergesort q = new Mergesort();
		Random rm = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of n");
		n = scan.nextInt();
		System.out.println("The random elements are");
		for(int i = 0;i<n;i++) {
			arr[i] = rm.nextInt(1000);
		}
		System.out.println("The Unsorted random elements are");
		for(int i = 0;i<n;i++) {
			System.out.println("\n"+arr[i]);
		}
		
		long startTime = System.currentTimeMillis();
		q.merge(arr, 0, n-1);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		
		System.out.println("The sorted elements are:");
		for(int i = 0;i<n;i++) {
			System.out.println("\n"+arr[i]);
		}
		
		System.out.println("Total time taken is "+totalTime+"ms");
		
		scan.close();
	}

}
