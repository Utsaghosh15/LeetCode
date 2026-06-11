
class Solution {

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

    public int orangesRotting(int[][] grid) {
     

     int cnt = 0;
     int cntFresh = 0;
     int maxTime = 0;
     int[] row_array = {-1,0,1,0};
     int[] col_array = {0,1,0,-1};
     Queue<Pair> queue = new LinkedList<>();
     boolean[][] visited_array = new boolean[grid.length][grid[0].length];
     
     for(int row=0;row<grid.length;row++){
      for(int col=0;col<grid[0].length;col++){

        if(grid[row][col] == 2 && visited_array[row][col] == false){
          visited_array[row][col] = true;
          queue.add(new Pair(row,col,0));  
        }

        if(grid[row][col] == 1)
          cntFresh+=1;
      }  
     }

     while(!queue.isEmpty()){

      int temp_row = queue.peek().first;
      int temp_col = queue.peek().second;
      int temp_time = queue.peek().time;
      queue.remove();

      maxTime = Math.max(maxTime,temp_time);

      for(int i=0;i<row_array.length;i++){
       
       int nrow = temp_row + row_array[i];
       int ncol = temp_col + col_array[i];

       if(nrow >= 0 && nrow < grid.length && ncol >= 0 && ncol < grid[0].length && grid[nrow][ncol] == 1 && visited_array[nrow][ncol] == false){
        visited_array[nrow][ncol] = true;
        queue.add(new Pair(nrow,ncol,temp_time+1));
        cnt+=1;
       }
      }
     }

     if(cnt != cntFresh)
      return -1;

     return maxTime; 
    }
}