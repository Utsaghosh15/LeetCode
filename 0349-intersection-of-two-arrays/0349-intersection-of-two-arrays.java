class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

     Set<Integer> set = new HashSet<>();
     List<Integer> result = new ArrayList<>();


     for(int i=0;i<nums1.length;i++)
       set.add(nums1[i]);


     for(int num : nums2){
       
      if(set.contains(num)){
       result.add(num); 
       set.remove(num);
      }
     }

     int[] ans = new int[result.size()];
     
     for(int i = 0; i < result.size(); i++)
        ans[i] = result.get(i);

     return ans;
    }
}