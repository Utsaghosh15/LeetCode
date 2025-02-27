class Solution {

    public void Permutation(int[] nums,List<List<Integer>> result,List<Integer> sol,boolean[] used){

     if(nums.length == sol.size()){
       result.add(new ArrayList<>(sol));
       return; 
     }   

     for(int i=0;i<nums.length;i++){

       if(used[i])
        continue;

       sol.add(nums[i]);
       used[i] = true;

       Permutation(nums,result,sol,used);

       sol.remove(sol.size()-1);
       used[i] = false;  
     }
    }


    public List<List<Integer>> permute(int[] nums) {


        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        Permutation(nums,result,new ArrayList<>(),used);

        return result;

    }
}