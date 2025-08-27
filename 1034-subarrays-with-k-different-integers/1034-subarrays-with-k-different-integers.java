class Solution {

    public int subArraySum(int[] nums,int k){
     
     if(k < 0) 
      return 0;


     int result = 0;
     int start = 0;
     int end = 0;
     HashMap<Integer,Integer> map = new HashMap<>();


     while(end < nums.length){ 
      
      map.put(nums[end],map.getOrDefault(nums[end],0)+1);

      while(map.size() > k){

        int cnt = map.get(nums[start]) - 1;
                if (cnt == 0) map.remove(nums[start]);
                else map.put(nums[start], cnt);

       start+=1;
      }

      result+=(end-start+1); 
      end+=1;
     }

     return result;
    }


    public int subarraysWithKDistinct(int[] nums, int k) {

     return subArraySum(nums,k) - subArraySum(nums,k-1);
    }
}