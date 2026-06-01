class Solution {
    public int largestRectangleArea(int[] heights) {

     Stack<int[]> stack = new Stack<>();
     int result = 0;

     for(int i=0;i<heights.length;i++){
      
      int start = i;

      while(!stack.isEmpty() && stack.peek()[1] > heights[i]){

       int[] top = stack.pop();
       int height = top[1];
       int width = i-top[0];

       result = Math.max(result,height*width);
       start = top[0]; 
      }

      stack.push(new int[]{start,heights[i]});
     }

     while(!stack.isEmpty()){
       int[] top = stack.pop();
       int width = heights.length-top[0];
       result = Math.max(result,width * top[1]); 
     } 

     return result;   
    }
}