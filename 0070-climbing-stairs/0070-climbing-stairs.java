class Solution {

    // public int climbStair(int n){

    //  if(n <= 1)
    //   return 1;
     
    //  return climbStair(n-1) + climbStair(n-2);
    // }

    public int climbStair(int n,int[] result){

     if(n <= 1)
      return 1;

     if(result[n] != 0)
      return result[n]; 
     
     return result[n] = climbStair(n-1,result) + climbStair(n-2,result);
    }

    public int climbStairs(int n) {

     int[] result = new int[n+1];

     return climbStair(n,result);   
    }
}