package program_5;

public class Mergesort {
	
	public void merge(int arr[], int low, int high) {
		int mid;
		if(low<high) {
			mid = (low+high)/2;
			merge(arr,low,mid);
			merge(arr,mid+1,high);
			simplemerge(arr,low,mid,high);
		}
	}
	
	public void simplemerge(int arr[],int low,int mid,int high) {
		
		int i = low;
		int j = mid+1;
		int k = low;
		int [] c = new int[1000];
		while(i<=mid && j<=high) {
			if(arr[i]<arr[j]) {
				c[k] = arr[i];
				i++;
				k++;
			}
			else {
				c[k] = arr[j];
				j++;
				k++;
			}
			
		}
		
		while(i<=mid) {
			c[k] = arr[i];
			k++;
			i++;
		}
		while(j<=high) {
			c[k] = arr[j];
			k++;
			j++;
		}
		
		for(int d = low; d<=high;d++) {
			arr[d] = c[d];
		}
		
	}

}






