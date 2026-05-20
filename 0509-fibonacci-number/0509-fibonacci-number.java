class Solution {
    
    // Tabulation 
    public int fibonacci(int n,int[] result){

    //  result[0] = 0;       
    //  result[1] = 1;
     
     if(n<=1)
      return n;

     int last = 0;
     int second_last = 1;
     int ans = 0;
     
     for(int i=2;i<=n;i++){  
      ans = second_last + last;
      last = second_last;
      second_last = ans; 
     }
     
    //  return result[n];
     return ans;     
    }

    // Memorization
    // public int fibonacci(int n,int[] result){

    //  if(n<=1)
    //   return n;

    //  if(result[n] != 0)
    //   return result[n];

    //  return result[n] = fibonacci(n-1,result) + fibonacci(n-2,result);    
    // }
    
    public int fib(int n) {

     int[] result = new int[n+1]; 

     return fibonacci(n,result);    
    }
}