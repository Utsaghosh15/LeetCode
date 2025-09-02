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

      if(nrow >= 0 && nrow < row_length && ncol >= 0 && ncol < col_length && isConnected[nrow][ncol] == 'O' && visited_array[nrow][ncol] == false){ 
        DFS(nrow,ncol,visited_array,isConnected); 
      } 
    }  
   }

    public void solve(char[][] board) {

     boolean[][] visited_array = new boolean[board.length][board[0].length];
     int n = board.length;
     int m = board[0].length;

     for(int i=0;i<m;i++){
       
       if(board[0][i] == 'O' && visited_array[0][i] == false)
        DFS(0,i,visited_array,board);

       if(board[n-1][i] == 'O' && visited_array[n-1][i] == false)
        DFS(n-1,i,visited_array,board);    
     }

     for(int i=0;i<n;i++){
       
       if(board[i][0] == 'O' && visited_array[i][0] == false)
        DFS(i,0,visited_array,board);

       if(board[i][m-1] == 'O' && visited_array[i][m-1] == false)
        DFS(i,m-1,visited_array,board);    
     }
 
      for(int i=0;i<board.length;i++){
       for(int j=0;j<board[0].length;j++){
        if(visited_array[i][j] == false && board[i][j] == 'O')
         board[i][j] = 'X';
       } 
      }
    }   
}