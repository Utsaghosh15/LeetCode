class Solution {

    // public int climbStair(int n){

    //  if(n <= 1)
    //   return 1;
     
    //  return climbStair(n-1) + climbStair(n-2);
    // }
   
    // Memorization
    // public int climbStair(int n,int[] result){

    //  if(n <= 1)
    //   return 1;

    //  if(result[n] != 0)
    //   return result[n]; 
     
    //  return result[n] = climbStair(n-1,result) + climbStair(n-2,result);
    // }
 

    // Tabulation
    public int climbStair(int n,int[] result){

     if(n<=1)
      return 1;

    //  result[0] = 1;
    //  result[1] = 1;

     int last = 1;
     int second_last = 1;
     int ans = 0;

     for(int i=2;i<=n;i++){
      result[i] = result[i-1] + result[i-2];

      ans = last+second_last;
      last = second_last;
      second_last = ans;
     }

    //  return result[n]; 
     return ans;  
    }


    public int climbStairs(int n) {

     int[] result = new int[n+1];

     return climbStair(n,result);   
    }
}