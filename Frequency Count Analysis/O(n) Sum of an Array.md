# O(n) Analysis example
## Sum of an array
Consider the following algorithm  
Function SumArray(A,n):  
begin
  
> S = 0 --> **Line 1**  
Loop: let i = 0, check i<n, increase i by 1  **Line 2**  
{  
    S = S + A[i]  **Line 3**  
}  
return S **Line 4**

end
### Explanation
In the above algorithm, four words are used : A(n), n, S, i  
And about no. of operations  
>Line 1 : 1  
Line 2 : (n+1) majority 
>>i=0 -- > 1  
i<n --> n+1  
i increase --> n  

>Line 3 : n  
Line 4 : 1  

### Conclusion
Here,  
--> the no.of operations is given by  
>f( n ) = 1+(n+1)+n+1  
**2n + 3** ==> Order( n )  

--> About space usage, 4 words(term used for container) are used  
>S( n ) = **n+3** ==> Order( 1 )  
