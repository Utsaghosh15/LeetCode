class Solution {

    public void combinationSumTwo(int index,int[] candidates,int target,List<List<Integer>> result,List<Integer> list){

     if(target == 0){
      result.add(new ArrayList<>(list));
      return;  
     }

     for(int i=index;i<candidates.length;i++){

      if(i > index && candidates[i] == candidates[i-1])
        continue;

      if(candidates[i] > target)
        break;

      list.add(candidates[i]);
      combinationSumTwo(i+1,candidates,target-candidates[i],result,list);
      list.remove(list.size()-1);     
     }
         
    } 
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

     List<List<Integer>> result = new ArrayList<>();
     Arrays.sort(candidates);
     combinationSumTwo(0,candidates,target,result,new ArrayList<>());

     return result;
    }
}