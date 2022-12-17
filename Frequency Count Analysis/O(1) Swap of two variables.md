# O(1) Analysis example 
## Swap of two variables  

consder the following algorithm

Function Swap ( A, B )    
 begin  
 >temp = A     
 A = B  
 B = temp  
 
 end
### Explanation
In the above algorithm, three variables are used A, B, temp  
and there are three operations happening  
temp = A --> 1  
A = B --> 1  
B = temp --> 1

### Conclusion
Here,  
--> the no.of operations is given by  
>f( n ) = 3 ==> Order( 1 )  

--> About space usage, 3 words(term used for container) are used  
>S( n ) = 3 ==> Order( 1 )  

As these are constants.