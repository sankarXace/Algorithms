# O(n^2) Analysis example
## Sum of Two matrixes
Consider the following program  

    public static int[][] Sum (int[][] A,int[][] B,int n)  
    {  
        int C[][] = new int[n][n];           // Line 1 --> 1
        for(int i=0;i<n;i++){                // Line 2 --> n+1 
            for(int j=0;j<n;j++){            // Line 3 --> n * n+1
                C[i][j] = A[i][j] + B[i][j]; // Line 4 --> n * n * 1
            }
        }  
        return C;                            // Line 5 --> 1
    }

### Explanation
In the above algorithm, four words are used : **A(n^2), B(n^2), n, C(n^2), i, j**  
And about no. of operations  
>Line 1: **1**   
Line 2: **( n+1 )**   
Line 3: **( n * n+1)**     
Line 4: **( n * n * 1)**    
Line 5: **1**

### Conclusion
Here,  
--> the no.of operations is given by  
>f( n ) = 1 + ( n+1 ) + ( n * n+1 ) + ( n * n * 1 ) + 1    
**2n^2+2n+3** ==> Order( n^2 )  

--> About space usage, 6 words(term used for container) are used  
>S( n ) = n^2 + n^2 + 1 + n^2 + 1 + 1  
**3n^2+3** ==> Order( n^2 )