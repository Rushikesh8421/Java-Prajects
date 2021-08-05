package array.java;

import java.util.Arrays;
import java.util.Scanner;

public class Kthminmax {

	public static void main(String[] args) {
		int arr[] = {21,5,6,22,64,82,55,32};
		int n = arr.length;
		System.out.println("The lenght of array is: "+ n);
		System.out.println("The given array elements are:");
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of k:");
		int k = scan.nextInt();
		int kmin = arr[k-1];
		int kmax = arr[n-k];
		System.out.print("The minimum kth value is: "+kmin);
		System.out.println();
		System.out.println("The maximum kth value is: "+kmax);
		scan.close();

	}

}
