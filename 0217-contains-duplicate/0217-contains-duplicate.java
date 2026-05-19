class Solution {
    public boolean containsDuplicate(int[] nums) {

     HashMap<Integer, Integer> map = new HashMap<>();

     for(int number: nums){
      
      if(map.containsKey(number))
       return true;

      map.put(number,1); 
     }

     return false;   
    }
}