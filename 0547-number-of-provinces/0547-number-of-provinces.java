class Solution {

 public void dfs(int i,ArrayList<ArrayList<Integer>> adjList,boolean vis[]){

  vis[i] = true;

  for(Integer it: adjList.get(i)){
   if(vis[it] == false)
    dfs(it,adjList,vis);
  }
 }   

 public int findCircleNum(int[][] isConnected) {
  
  ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

  for(int i=0;i<isConnected.length;i++){
    adjList.add(new ArrayList<Integer>());
  } 


// changing adjacent matrix to adjacent list
  for(int i=0;i<isConnected.length;i++){
   for(int j=0;j<isConnected.length;j++){

    if(isConnected[i][j] == 1 && i!=j){
        adjList.get(i).add(j);
        adjList.get(j).add(i);
    }
   } 
  }

  boolean vis[] = new boolean[isConnected.length];
  int cnt = 0;

  for(int i=0;i<isConnected.length;i++){
   if(vis[i] == false){
    cnt++;
    dfs(i,adjList,vis);
   }
  }

  return cnt;
 }
}