class Solution {
    public int peakIndexInMountainArray(int[] arr) {

     int low = 0;
     int high = arr.length-1;
     int result = 0;

     while(low <= high){
      
      int mid = (high+low)/2;

      if(arr[mid] < arr[mid+1]){
        low = mid+1;
      } 
      else{
        result = mid;
        high = mid-1;
      }
     }

     if(result == 0 || result == arr.length-1)
       return -1;

     return result;   
    }
}