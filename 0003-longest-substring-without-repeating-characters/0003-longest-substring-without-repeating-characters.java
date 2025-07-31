class Solution {
    public int lengthOfLongestSubstring(String s) {

     int result = 0;
     int start = 0;
     int end = 0;

     char[] chars = s.toCharArray();
     HashMap<Character, Integer> map = new HashMap<>(); 


     while(end < chars.length){

      if(map.containsKey(chars[end]) && map.get(chars[end]) >= start){
       start = map.get(chars[end])+1;
       map.put(chars[end],end);
      }
 
      map.put(chars[end],end); 
      
      result = Math.max(end-start+1,result);
      end+=1;  
     }

     return result;
    }
}