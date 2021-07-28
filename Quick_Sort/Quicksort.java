package prog4;

public class Quicksort {
	
	public int partition(int[] arr, int low, int high){
		int pivot = arr[(low+high)/2];
		
		while(low<=high) {
			while(arr[low]<pivot) {
				low++;
			}
			while(arr[high]>pivot) {
				high--;
			}
			if(low<=high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				
				low++;
				high--;
			}
		}
		return low;
	}

	public void quicksortRecursion(int arr[], int low, int high) {
		int pi = partition(arr,low, high);
		if(low<pi-1) {
			quicksortRecursion(arr,low,pi-1);
		}
		if(high>pi) {
			quicksortRecursion(arr,pi,high);
		}
	}

}
