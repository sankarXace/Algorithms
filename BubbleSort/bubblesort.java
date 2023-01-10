import java.util.*;

public class bubblesort{

	static Scanner s = new Scanner(System.in);

	public static void sort(int[] arr, int n) {
		int temp;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
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