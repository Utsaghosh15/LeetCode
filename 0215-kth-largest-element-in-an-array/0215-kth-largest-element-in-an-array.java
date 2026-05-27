class Solution {
    public int findKthLargest(int[] nums, int k) {

     PriorityQueue<Integer> pq = new PriorityQueue<>();
     int pointer = 0;

     while(pointer < k){
      pq.add(nums[pointer]);
      pointer+=1;  
     }

     while(pointer < nums.length){

      if(nums[pointer] > pq.peek()){
        pq.poll();
        pq.offer(nums[pointer]);
      }
      pointer+=1;
     } 

     return pq.poll();   
    }
}