class Solution {
    public int majorityElement(int[] nums) {

    //  HashMap<Integer, Integer> map = new HashMap<>();

    //  for(int i=0;i<nums.length;i++){

    //   if(!map.containsKey(nums[i])){
    //     map.put(nums[i],1);
    //   }  
    //   else{
    //     map.put(nums[i], map.get(nums[i])+1);
    //   }
    //  }
     
    //  int result = 0;
    //  int highest_num = 0;


    // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

    //   if(entry.getValue() > highest_num){
    //    highest_num = entry.getValue();     
    //    result = entry.getKey();
    //   }
    // }     

    // Arrays.sort(nums);
    
    // int result = 0;
    // int duplicate = 0;
    // int start_index = 0;

    // while(start_index < nums.length){

    //  int temp = nums[start_index];
    //  int temp_duplicate = 1;
    //  int temp_start_index = start_index+1;

    //  while(temp_start_index < nums.length){

    //   if(temp == nums[temp_start_index])
    //    temp_duplicate+=1;

    //   if(temp != nums[temp_start_index]){
    //     start_index = temp_start_index-1;
    //     break;
    //   }


    //   temp_start_index++;  
    //  }

    //  if(temp_duplicate > duplicate){ 
    //   result = temp;
    //   duplicate = temp_duplicate; 
    //  }

    //  start_index+=1;   
    // }
    
    // return result;

     int count = 0;
     int result = 0;

     for(int i=0;i<nums.length;i++){

      if(count == 0){
        result = nums[i];
      }

      if(nums[i] == result)
        count++;
      else
        count--;  
     }

     return result;
    }
}