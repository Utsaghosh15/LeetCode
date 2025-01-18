// import java.util.*;

class Pair{
 
 int first;
 int second;

 public Pair(int first,int second){
   this.first = first;
   this.second = second; 
 }
}
class Solution {

    public void BFS(int row,int col,boolean[][] visited_array,char[][] grid){

      Queue<Pair> queue = new LinkedList<Pair>();
      queue.add(new Pair(row,col));
      visited_array[row][col] = true;


     while(!queue.isEmpty()){


      int temp_row = queue.peek().first;
      int temp_col = queue.peek().second;
      queue.remove();
      int[] row_array = {-1,0,1,0};
      int[] col_array = {0,1,0,-1};
      
      for(int i=0;i<row_array.length;i++){
       
       int nrow = temp_row + row_array[i];
       int ncol = temp_col + col_array[i];

       if(nrow >= 0 && nrow < grid.length && ncol >=0 && ncol < grid[0].length && visited_array[nrow][ncol] == false && grid[nrow][ncol] == '1'){
        queue.add(new Pair(nrow,ncol));
        visited_array[nrow][ncol] = true;
       } 
      }
     } 
    }

    public int numIslands(char[][] grid) {

     boolean[][] visited_array = new boolean[grid.length][grid[0].length];

     int count = 0;

     for(int i=0;i<grid.length;i++){
      for(int j=0;j<grid[0].length;j++){
       if(visited_array[i][j] == false && grid[i][j] == '1'){
        count+=1;
        BFS(i,j,visited_array,grid);
       }
      }   
     }

     return count;   
    }
}