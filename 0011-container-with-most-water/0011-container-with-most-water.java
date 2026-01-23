class Solution {
    public int maxArea(int[] height) {

      int maxArea = 0;
      int start = 0;
      int end = height.length-1;

      while(start < end){

       int length = end-start;
       int breadth = Math.min(height[start],height[end]);
       int currentArea = length*breadth;
       maxArea = Math.max(currentArea,maxArea);

       if(height[start] > height[end])
         end-=1;
       else
         start+=1;
    
      }

      return maxArea;    
    }
}