class Pair {

 int row;
 int col;
 int distance;

 public Pair(int row,int col,int distance){
   this.row = row;
   this.col = col;
   this.distance = distance; 
 }   
}
class Solution {
   public int[][] updateMatrix(int[][] mat) {


    boolean[][] visited_array = new boolean[mat.length][mat[0].length];
    int[][] distance_array = new int[mat.length][mat[0].length];
    
    Queue<Pair> queue = new LinkedList<Pair>();

    for(int row=0;row<mat.length;row++){
     for(int col=0;col<mat[0].length;col++){

      if(mat[row][col] == 0){
        queue.add(new Pair(row,col,0));
        visited_array[row][col] = true;
      }
        
     }   
    }

    int[] row_array = {-1,0,1,0};
    int[] col_array = {0,1,0,-1};

    while(!queue.isEmpty()){

     int row = queue.peek().row;
     int col = queue.peek().col;
     int distance = queue.peek().distance;

     distance_array[row][col] = distance;

     queue.remove();

     for(int i=0;i<row_array.length;i++){

      int nrow = row+row_array[i];
      int ncol = col+col_array[i];  

      if(nrow >= 0 && nrow < mat.length && ncol >= 0 && ncol < mat[0].length && visited_array[nrow][ncol] == false){
        
        visited_array[nrow][ncol] = true;
        queue.add(new Pair(nrow,ncol,distance+1));
      }
     }   
    }

    return distance_array;
   }
}