class Solution {

    public boolean CheckMin(int[] piles,int currentRate,int h){

     int currentHours = 0;
     
        for(int i = 0; i < piles.length; i++) {
            currentHours += (piles[i] + currentRate - 1) / currentRate;

            if (currentHours > h) 
                return false;
        }
        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {


     int low = 1;
     int high = piles[piles.length-1];
     for (int p : piles) high = Math.max(high, p);
     int result = high;

     while(high >= low){
      
      int mid = low + (high-low)/2;

      if(CheckMin(piles,mid,h)){
        result = mid;
        high = mid-1;
      }
      else{
        low = mid+1;
      }
     }


     return result; 
    }
}