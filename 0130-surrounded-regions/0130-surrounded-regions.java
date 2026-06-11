class Solution {

    public void DFS(int row, int col, char[][] board, boolean[][] visited_array){  

     visited_array[row][col] = true;
     int[] row_array = {-1,0,1,0};
     int[] col_array = {0,1,0,-1};

      for(int i=0;i<row_array.length;i++){

       int nrow = row + row_array[i];
       int ncol = col + col_array[i]; 

       if(nrow >= 0 && nrow < board.length && ncol >= 0 && ncol < board[0].length && board[nrow][ncol] == 'O' && visited_array[nrow][ncol] == false){
        DFS(nrow,ncol,board,visited_array); 
       } 
      }      
     }
    


    public void solve(char[][] board) {

     boolean[][] visited_array = new boolean[board.length][board[0].length];   


     for(int i=0;i<board[0].length;i++){

      if(board[0][i] == 'O' && visited_array[0][i] == false)
        DFS(0,i,board,visited_array);

      if(board[board.length-1][i] == 'O' && visited_array[board.length-1][i] == false)
        DFS(board.length-1,i,board,visited_array);    
     }

     for(int i=0;i<board.length;i++){

      if(board[i][0] == 'O' && visited_array[i][0] == false)
       DFS(i,0,board,visited_array);

      if(board[i][board[0].length-1] == 'O' && visited_array[i][board[0].length-1] == false)
       DFS(i,board[0].length-1,board,visited_array);   
     }
     
     for(int row=0;row < board.length;row++){
       for(int col=0;col < board[0].length;col++){

        if(visited_array[row][col] == false && board[row][col] == 'O'){
         board[row][col] = 'X';
        }
       } 
     }

    }   
}