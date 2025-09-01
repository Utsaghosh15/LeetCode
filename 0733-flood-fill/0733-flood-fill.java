class Solution {

   public void DFS(int row,int col,int color,int prevcolor,boolean[][] visited_array,int[][] isConnected){ 
    
    visited_array[row][col] = true;
    isConnected[row][col] = color; 
    int[] row_array = {-1,0,1,0}; 
    int[] col_array = {0,1,0,-1}; 
    int row_length = isConnected.length; 
    int col_length = isConnected[0].length; 

    for(int i=0;i<row_array.length;i++){ 
      int nrow = row_array[i]+row; 
      int ncol = col_array[i]+col; 
      if(nrow >= 0 && nrow < row_length && ncol >= 0 && ncol < col_length && isConnected[nrow][ncol] == prevcolor && visited_array[nrow][ncol] == false){ 
        DFS(nrow,ncol,color,prevcolor,visited_array,isConnected); 
      } 
    }  
   }

   public int[][] floodFill(int[][] image, int sr, int sc, int color) {

    boolean[][] visited_array = new boolean[image.length][image[0].length]; 

    DFS(sr,sc,color,image[sr][sc],visited_array,image); 
     
    
    return image;     
   }
}