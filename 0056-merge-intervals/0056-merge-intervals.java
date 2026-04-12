class Solution {
    public int[][] merge(int[] [] intervals) {

      Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

      int[][] result = new int[intervals.length][intervals[0].length];
      int idx = 0; 

      int start = intervals[0][0];
      int end = intervals[0][1];

      for(int i=1;i<intervals.length;i++){
       
       if(intervals[i][0] <= end){
        
        end = Math.max(end,intervals[i][1]);
       }
       else{
         
         result[idx][0] = start;
         result[idx][1] = end;
         idx+=1;

         start = intervals[i][0];
         end = intervals[i][1];
       }
      }

      result[idx][0] = start; 
      result[idx][1] = end; 
      idx+=1;

      return Arrays.copyOfRange(result,0,idx);
    }
}