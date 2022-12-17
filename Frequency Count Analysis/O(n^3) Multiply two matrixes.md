# O(n^3) Analysis Example
## Multiplication of Two matrixes
Consider the following program  

        public static int[][] multiply(int[][] A, int[][] B,int n)
        {
            int[][] C = new int[n][n];                  // Line 1 --> 1
            for(int i=0;i<n;i++){                       // Line 2 --> n+1
                for(int j=0;j<n;j++){                   // Line 3 --> n * n+1
                    C[i][j] = 0;                        // Line 4 --> n * n * 1
                    for(int k=0;k<n;k++){               // Line 5 --> n * n * n+1
                        C[i][j]+= A[i][k]*B[k][j];      // Line 6 --> n * n * n * 1
                    }
                }
            }
            return C;                                   // Line 7 --> 1
        }

### Explanation
In the above algorithm, four words are used : **A(n^2), B(n^2), n, C(n^2), i, j, k**  
And about no. of operations  
>Line 1: **1**   
Line 2: **( n+1 )**   
Line 3: **( n * n+1)**     
Line 4: **( n * n * 1)**    
Line 5: **( n * n * n+1)**  
Line 6: **( n * n * n * 1)**  
Line 7: **1**

### Conclusion
Here,  
--> the no.of operations is given by  
>f( n ) = 1 + ( n+1 ) + ( n * n+1 ) + ( n * n * 1 ) + ( n * n * n+1 ) + ( n * n * n * 1 ) + 1     
**2n^3+3n^2+2n+3** ==> Order( n^3 )  

--> About space usage, 6 words(term used for container) are used  
>S( n ) = n^2 + n^2 + 1 + n^2 + 1 + 1  
**3n^2+4** ==> Order( n^2 )