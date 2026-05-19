class Solution {
    public int[] topKFrequent(int[] nums, int k) {

     HashMap<Integer,Integer> map = new HashMap<>();
     int[] result = new int[k];
     
     for(int number: nums)
      map.put(number, map.getOrDefault(number,0)+1);

     PriorityQueue<Integer> heap = new PriorityQueue<>(
      (a,b) -> map.get(a) - map.get(b)  
     );

     for(int key: map.keySet()){
      heap.offer(key);

      if(heap.size() > k)
       heap.poll();  
     }

     for(int i=k-1;i>=0;i--)
      result[i] = heap.poll();
     
     return result;
    }
}