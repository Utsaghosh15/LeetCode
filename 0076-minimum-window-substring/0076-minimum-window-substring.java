import java.util.*;

class Solution {
    public String minWindow(String s, String t) {

        if(s == null || t == null || s.length() < t.length()) 
           return "";

    
        int[] need = new int[128];
        int required = 0;

        for (char c : t.toCharArray()) {
            need[c]++;
            required++; 
        }

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE, minL = 0;

        while (right < s.length()) {
            char rc = s.charAt(right);

            if(need[rc] > 0) 
              required--;
            
            need[rc]--;
            right++;

            while (required == 0) {

                if (right - left < minLen) {
                    minLen = right - left;
                    minL = left;
                }

                char lc = s.charAt(left);
                need[lc]++; 

                if(need[lc] > 0) 
                  required++;
                
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minL, minL + minLen);
    }
}
