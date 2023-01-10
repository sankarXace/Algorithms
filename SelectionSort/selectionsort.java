import java.util.*;

public class selectionsort{

	static Scanner s = new Scanner(System.in);

	public static void sort(int[] arr, int n) {
		int small_index, temp;
		for(int s=0; s<n; s++) {
			small_index = s;
			for(int l=s; l<n; l++) {
				if(arr[l]<arr[s]) {
					small_index = l;
				}
				temp = arr[s];
				arr[s] = arr[small_index];
				arr[small_index] = temp;
			}
		}
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
		sort(arr,n);
		System.out.println("Array after sorting: ");
		printArray(arr,n);

	}
}