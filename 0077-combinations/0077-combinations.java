class Solution {
    
    public void Combination(int n,int k,int current,List<List<Integer>> result, List<Integer> sol){

      if(sol.size() == k){
        result.add(new ArrayList<>(sol));
        return;
      }

      for(int i=current;i<n+1;i++){

        sol.add(i);
        Combination(n,k,i+1,result,sol);
        sol.remove(sol.size()-1);
      
      }
    }
    
    public List<List<Integer>> combine(int n, int k) {

      List<List<Integer>> result = new ArrayList<>();
      List<Integer> comb = new ArrayList<>();

      Combination(n,k,1,result,comb);
      
      return result;
    }
}