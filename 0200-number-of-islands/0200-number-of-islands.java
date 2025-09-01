class Solution {

   public void DFS(int row,int col,boolean[][] visited_array,char[][] isConnected){ 
    
    visited_array[row][col] = true; 
    int[] row_array = {-1,0,1,0}; 
    int[] col_array = {0,1,0,-1}; 
    int row_length = isConnected.length; 
    int col_length = isConnected[0].length; 

    for(int i=0;i<row_array.length;i++){ 
      int nrow = row_array[i]+row; 
      int ncol = col_array[i]+col; 
      if(nrow >= 0 && nrow < row_length && ncol >= 0 && ncol < col_length && isConnected[nrow][ncol] == '1' && visited_array[nrow][ncol] == false){ 
        DFS(nrow,ncol,visited_array,isConnected); 
      } 
    }  
   }

   public int numIslands(char[][] grid) {

    boolean[][] visited_array = new boolean[grid.length][grid[0].length]; 
    int result = 0; 
    
    for(int row=0;row<grid.length;row++){ 
        for(int col=0;col<grid[0].length;col++){ 
            if(grid[row][col] == '1' && visited_array[row][col] == false){ 
                result+=1; DFS(row,col,visited_array,grid); 
            } 
        } 
    } 
    
    return result;        
   }
}