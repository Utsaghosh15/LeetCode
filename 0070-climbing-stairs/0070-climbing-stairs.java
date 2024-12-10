class Solution {

    public int climbStair(int n,int[] dp){
     
     if(n == 0)
      return 1; 

     if(dp[n] != 0)
      return dp[n];     
     
     return  dp[n] = (n >= 2 ? climbStair(n-2,dp) : 0) + climbStair(n-1,dp); 
    }
    
    public int climbStairs(int n){

     int[] dp = new int[n+1];


     return climbStair(n,dp);
    }


    // public int climbStairs(int n) {
     
    //  int prev2 = 1;
    //  int prev = 1;
    //  int curri = 0;

    //  for(int i=2;i<=n;i++){

    //   curri = prev + prev2;

    //   prev2 = prev;
    //   prev = curri;  
    //  }

    //  return prev; 
    // }
}