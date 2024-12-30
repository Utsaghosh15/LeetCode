class Solution {
    public int maxProfit(int[] prices) {

     if(prices.length == 1) 
      return 0;

     int start = 0;
     int end = start+1;
     int result = 0;

     while(end < prices.length && start < prices.length && end > start){

      if(prices[end] > prices[start]){
       result = Math.max(result,(prices[end]-prices[start]));
       end+=1;
      }
      else{
        start = end;
        end+=1;
      }
     }

     return result;
    }
}