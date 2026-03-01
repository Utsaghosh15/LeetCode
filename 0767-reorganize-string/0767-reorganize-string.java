class Solution {
    public String reorganizeString(String s) {
     
     PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);
     StringBuilder result = new StringBuilder();
     HashMap<Character,Integer> map = new HashMap<>();

     for(int i=0;i<s.length();i++)
       map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);  
     
     for(Map.Entry<Character, Integer> entry : map.entrySet())
       pq.offer(new int[]{entry.getValue(), entry.getKey()});

     while(!pq.isEmpty()){

      int[] pair = pq.poll();

      if(result.length() == 0 || result.charAt(result.length()-1) != (char) pair[1]){
       result.append((char) pair[1]);
       pair[0]-=1;

       if(pair[0] > 0)
        pq.add(pair);
      }
      else{
       
       if(pq.isEmpty())
        return "";

       int[] pair2 = pq.poll();
       result.append((char) pair2[1]);
       pair2[0]-=1;

       if(pair2[0] > 0)
        pq.add(pair2);

       pq.add(pair); 
      } 
     }  


     return result.toString();
    }
}