class Solution {
    public int numberOfSubstrings(String s) {

     int index = 0;
     int ans = 0;
     int[] hash = {-1,-1,-1};

     while(index < s.length()){

      hash[s.charAt(index)-'a'] = index;  
      
      if(hash[0] != -1 && hash[1] != -1 && hash[2] != -1)
        ans = ans+Math.min(hash[0],Math.min(hash[1],hash[2]))+1;
 
      index+=1;  
     }

     return ans;   
    }
}