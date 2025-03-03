class Solution {

    public void Combination(int[] candidates,int target,int index,int currentSum,List<List<Integer>> result,List<Integer> sol){

      if(currentSum == target){
        result.add(new ArrayList<>(sol));
        return;
      }        

      if(index >= candidates.length || currentSum > target)
        return;

      sol.add(candidates[index]);
      Combination(candidates,target,index,currentSum+candidates[index],result,sol);
      sol.remove(sol.size()-1);
      Combination(candidates,target,index+1,currentSum,result,sol);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

     List<List<Integer>> result = new ArrayList<>();

     Combination(candidates,target,0,0,result,new ArrayList<>());

     return result;  
    }
}