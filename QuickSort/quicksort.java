import java.util.*;

public class quicksort {

	static Scanner s = new Scanner(System.in);
	public static void sort(int [] arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr,low,high);
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
		}
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high],temp;
		int i = low - 1;
		for(int j=low; j<=high-1; j++) {
			if(arr[j]<pivot) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}

	public static void printArray(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Enter the length of array: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values: ");
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Array before sorting: ");
		printArray(arr,n);
		sort(arr,0,n-1);
		System.out.println("Array after sorting: ");
		printArray(arr,n);

	}
}