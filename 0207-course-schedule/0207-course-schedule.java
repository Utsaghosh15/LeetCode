class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

      ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

      for(int i=0;i<numCourses;i++)
        adj.add(new ArrayList<>());
      
      for(int i=0;i<prerequisites.length;i++)
       adj.get(prerequisites[i][0]).add(prerequisites[i][1]);

      int indegree[] = new int[numCourses];

      for(int i=0;i<numCourses;i++){
        for(int it: adj.get(i))
         indegree[it]++;
      }

      Queue<Integer> queue = new LinkedList<Integer>();
      
      for(int i=0;i<numCourses;i++){
        if(indegree[i] == 0)
         queue.add(i);
      }

      List<Integer> topo = new ArrayList<Integer>();

      while(!queue.isEmpty()){f

       int node = queue.peek();
       queue.remove();
       topo.add(node);

       for(int it:adj.get(node)){
        indegree[it]--;
        
        if(indegree[it] == 0)
         queue.add(it);
       } 
      }

      if(topo.size() == numCourses)    
       return true;

       return false;  
    }


}