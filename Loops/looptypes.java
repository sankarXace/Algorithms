import java.util.*;

class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		/* loops are used to do an operation for multiple times. There are 3 types of loops

		They are,  1. FOR loop
				   2. WHILE loop
				   3. DO WHILE loop

		lets consider that we want to print perfect squares upto 100 

		Using FOR loop:    */
		int v1 = 100 ;
		for (int i=1;i*i<=100;i++){
			System.out.print(i*i+" ");
		}
		System.out.println("\nUsing FOR loop\n");
		/*
		Using WHILE loop:  */
		int v2 = 100;
		int j=1 ;
		while(j*j<=100){
			System.out.print(j*j+" ");
			j++;
		}
		System.out.println("\nUsing WHILE loop\n");
		/*
		Using DO WHILE loop   */
		int v3 = 100 ; 
		int k=1 ;
		do {
			System.out.print(k*k+" ");
			k++;
		} while(k*k<=100) ;
		System.out.println("\nUsing DO WHILE loop\n");
	}
}


/* OUTPUT : 
1 4 9 16 25 36 49 64 81 100
Using FOR loop

1 4 9 16 25 36 49 64 81 100
Using WHILE loop

1 4 9 16 25 36 49 64 81 100
Using DO WHILE loop */