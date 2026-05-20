class Solution {
    
    // public int fibonacci(int n,int[] result){

    //  result[0] = 0;       
    //  result[1] = 1;
     
    //  for(int i=2;i<=n;i++){
    //   result[i] = result[i-1] + result[i-2];
    //  }
     
    //  return result[n];     
    // }

    public int fibonacci(int n,int[] result){

     if(n<=1)
      return n;

     if(result[n] != 0)
      return result[n];

     return result[n] = fibonacci(n-1,result) + fibonacci(n-2,result);    
    }
    
    public int fib(int n) {

     int[] result = new int[n+1]; 

     return fibonacci(n,result);    
    }
}