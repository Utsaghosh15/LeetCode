class Solution {
    
    public void Combination(int[] nums,List<List<Integer>> result,List<Integer> sol,int start){

      if(start >= nums.length){
        result.add(new ArrayList<>(sol));
        return;
      }

       sol.add(nums[start]);
       Combination(nums,result,sol,start+1);
       sol.remove(sol.size()-1);
       Combination(nums,result,sol,start+1); 
    
    }
    
    public List<List<Integer>> subsets(int[] nums) {

     List<List<Integer>> result = new ArrayList<>();   

     Combination(nums,result,new ArrayList<>(),0); 

     return result;
    }
}