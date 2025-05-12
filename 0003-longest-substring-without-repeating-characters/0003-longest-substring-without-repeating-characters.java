class Solution {
    public int lengthOfLongestSubstring(String s) {

     if(s.length() == 1)
      return 1;

     if(s.length() == 0)
      return 0;    

     int start = 0;
     int end = 0;
     int ans = Integer.MIN_VALUE;
     char[] charArray = s.toCharArray();
     HashMap<Character,Integer> map = new HashMap<>();

     while(end<charArray.length){
      
      if(map.containsKey(charArray[end]))   
       start = Math.max(map.get(charArray[end])+1,start);
      
      map.put(charArray[end],end);
      ans = Math.max(ans,end-start+1);
      end+=1; 
     }

     return ans;
    }
}