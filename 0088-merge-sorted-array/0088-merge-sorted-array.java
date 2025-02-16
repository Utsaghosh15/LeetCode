class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

    //  int nums1_length = 0;
    //  int nums2_length = 0;
    //  int result_length = 0;
    //  int[] result_array = new int[nums1.length];
    //  int nums1_count = 0;
    //  int nums2_count = 0;

    //  while(nums2_length < nums2.length && nums1_length < nums1.length){

    //   if(nums1[nums1_length] == 0 && nums1_count >= m){
    //     nums1_length++;
    //     continue;
    //   }

    //   if(nums2[nums2_length] == 0 && nums2_count >= n){
    //     nums2_length++;
    //     continue;
    //   }

    //   if(nums1[nums1_length] < nums2[nums2_length]){
    //     result_array[result_length] = nums1[nums1_length];
    //     nums1_count++;
    //     nums1_length++;
    //   }  
    //   else{
    //     result_array[result_length] = nums2[nums2_length];
    //     nums2_count++;
    //     nums2_length++;
    //   }
    //   result_length++;
    //  }

    //  while(nums1_length < nums1.length){

    //   if(nums1[nums1_length] == 0 && nums1_count >= m){
    //    nums1_length++; 
    //    continue;  
    //   }

    //   result_array[result_length] = nums1[nums1_length];
    //   result_length++;
    //   nums1_length++;  
    //   nums1_count++; 
    //  }

    //  while(nums2_length < nums2.length){

    //   if(nums2[nums2_length] == 0 && nums2_count >= n){
    //    nums2_length++;
    //    continue;  
    //   }

    //   result_array[result_length] = nums2[nums2_length];
    //   result_length++;
    //   nums2_length++;
    //   nums2_count++;  
    //  }

    //  for(int i=0;i<result_array.length;i++)
    //    nums1[i] = result_array[i]; 
     

    //  return;


     int nums1_pointer = m;
     int nums2_pointer = n;
     int result_pointer = m+n-1;

     while(nums2_pointer > 0 && nums1_pointer > 0){

      if(nums1[nums1_pointer-1] < nums2[nums2_pointer-1]){

        nums1[result_pointer] = nums2[nums2_pointer-1];
        nums2_pointer--;
      }
      else{
        nums1[result_pointer] = nums1[nums1_pointer-1];
        nums1_pointer--;        
      } 

      result_pointer--;        
     }

     while(nums2_pointer > 0){
      nums1[result_pointer] = nums2[nums2_pointer-1];
      result_pointer--;
      nums2_pointer--;  
     }

    }
}