//Move all the negative elements to one side of the array 

package array.java;

public class Negative {

	public static void main(String[] args) {
		int [] arr = {10,30,-2,-3,23,54,-34,11,-22,91,-21};
		int n = arr.length;
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				if(i!=j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		System.out.println("Array after re-arrangement");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
