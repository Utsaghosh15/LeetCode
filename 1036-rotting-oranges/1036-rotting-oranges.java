class Pair{

 int first;
 int second;
 int time;

 Pair(int first,int second,int time){

  this.first = first;
  this.second = second;
  this.time = time;  
 }   
}
class Solution {
    public int orangesRotting(int[][] grid) {

     int cntFresh = 0;
     Queue<Pair> queue = new LinkedList<Pair>();
     int[][] visited_array = new int[grid.length][grid[0].length];

     for(int i=0;i<grid.length;i++){
      for(int j=0;j<grid[0].length;j++){

        if(grid[i][j] == 2){
          queue.add(new Pair(i,j,0));
          visited_array[i][j] = 2;  
        }
        else{
          visited_array[i][j] = 0;  
        }

        if(grid[i][j] == 1)
         cntFresh++;
      }  
     }


     int result = 0;
     int cnt = 0;
     int[] row_array = {-1,0,1,0};
     int[] col_array = {0,1,0,-1};


     while(!queue.isEmpty()){

      int temp_row = queue.peek().first;
      int temp_col = queue.peek().second;
      int temp_time = queue.peek().time;
      queue.remove();

      result = Math.max(result,temp_time);

      for(int i=0;i<row_array.length;i++){
        
        int nrow = temp_row+row_array[i];
        int ncol = temp_col+col_array[i];

        if(nrow >= 0 && nrow < grid.length && ncol >= 0 && ncol < grid[0].length && visited_array[nrow][ncol] == 0 && grid[nrow][ncol] == 1){

         visited_array[nrow][ncol] = 2;
         cnt++;
         queue.add(new Pair(nrow,ncol,temp_time+1));   
        }

      }       
     }

      if(cnt != cntFresh)
        return -1;

      return result;  
    }
}