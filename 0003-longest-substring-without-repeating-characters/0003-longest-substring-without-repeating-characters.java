class Solution {
    public int lengthOfLongestSubstring(String s) {


     int longest_string = 0;
     int start = 0;
     int end = 0;
     char[] chars = s.toCharArray();
     HashSet<Character> set = new HashSet<>();

     while(end < chars.length){
       
      if(set.contains(chars[end])){

       while(chars[end] != chars[start]){
        set.remove(s.charAt(start));
        start+=1;
       }
       
        start+=1;
      }

       set.add(chars[end]);

       longest_string = Math.max((end-start+1),longest_string);
       end+=1;  
     }

     return longest_string;
    }
}