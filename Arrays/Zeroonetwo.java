package array.java;


public class Zeroonetwo {

	public static void main(String[] args) {
		int arr[] = {1,2,0,0,1,1,2,2,0};
		int n = arr.length;
		System.out.println("The unsorted array is:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		sortit(arr,n);
		
		System.out.println("The sorted array is:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void sortit(int arr[],int n) {
		int l = 0;
		int m = 0;
		int h = n-1, temp = 0;
		while (m<=h) {
			if(arr[m] == 0) {
				temp = arr[l];
				arr[l] = arr[m];
				arr[m] = temp;
				l++;
				m++;
			}
			else if(arr[m] == 1) {
				m++;
			}
			else if(arr[m] == 2){
				temp = arr[m];
				arr[m] = arr[h];
				arr[h] = temp;
				h--;
			}
		}
	}
	

}
