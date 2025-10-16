class Solution {

    public void combinationSumFunc(int index,int[] candidates,int target,List<Integer> list, List<List<Integer>> result){

      if(index == candidates.length){
       if(target == 0){
        result.add(new ArrayList<>(list)); 
       }
       return;
      }


      if(target - candidates[index] >= 0) {
       
       list.add(candidates[index]);
       combinationSumFunc(index,candidates,target-candidates[index],list,result);
       list.remove(list.size()-1);
      }

      combinationSumFunc(index+1,candidates,target,list,result);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

     List<List<Integer>> result = new ArrayList<>();

     combinationSumFunc(0,candidates,target,new ArrayList<>(),result);

     return result;   
    }
}