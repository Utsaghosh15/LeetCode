class Solution {

    public int NextGElement(int start,int end,int[] nums2){

     Stack<Integer> stack = new Stack<>();
     int[] nums3 = new int[end-start+1];
     System.out.println(nums3.length);
     int j = nums3.length-1;

     for(int i=end;i>=start;i--){

      while(!stack.isEmpty() && stack.peek() <= nums2[i])
       stack.pop();
      

      if(stack.isEmpty()){
        nums3[j] = -1;
        j--;
      }   
      else{
        nums3[j] = stack.peek();
        j--;
      }

      stack.push(nums2[i]);
     }

     return nums3[0];
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

     int[] result = new int[nums1.length];  
        
     int j = 0;  


     for(int n=0;n<nums1.length;n++){
      for(int i=0;i<nums2.length;i++){

       if(nums1[n] == nums2[i]){
        result[j] = NextGElement(i,nums2.length-1,nums2); 
        j++;
       }
      }
     } 

     return result;
    }
}