class Solution {

    public int BFS(int row, int col, int[][] grid, boolean[][] visited_array){

     int[] row_array = {-1,0,1,0};
     int[] col_array = {0,1,0,-1};

     Queue<int[]> queue = new LinkedList<>();
     visited_array[row][col] = true;
     queue.offer(new int[]{row,col});

     int area = 0;

     while(!queue.isEmpty()){

      int[] curr = queue.poll();
      area+=1;

      for(int i=0;i<row_array.length;i++){

        int nrow = curr[0]+row_array[i];
        int ncol = curr[1]+col_array[i];

        if(nrow >= 0 && nrow < grid.length && ncol >= 0 && ncol < grid[0].length && grid[nrow][ncol] == 1 && visited_array[nrow][ncol] == false){
          visited_array[nrow][ncol] = true;
          queue.offer(new int[]{nrow,ncol});  
        }  
      }
     } 

     return area;
    }

    public int maxAreaOfIsland(int[][] grid) {

     boolean[][] visited_array = new boolean[grid.length][grid[0].length];
     int result = 0;

     for(int row = 0;row<grid.length;row++){
      for(int col = 0;col<grid[0].length;col++){

       if(grid[row][col] == 1 && visited_array[row][col] == false)
         result = Math.max(result,BFS(row,col,grid,visited_array));
      }  
     }

     return result;   
    }
}