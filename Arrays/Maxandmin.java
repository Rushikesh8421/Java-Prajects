package array.java;

import java.util.Arrays;

public class Maxandmin {

	public static void main(String[] args) {
		int [] arr = {51,21,91,55,201,33,2,10};
		Arrays.sort(arr);
		int n = arr.length;
		int max = arr[n-1];
		int min = arr[0];
		System.out.println("Max = "+ max);
		System.out.println("Min = "+min);

	}

}
