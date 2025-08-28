import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        // Frequency of required chars from t
        int[] need = new int[128];
        int required = 0; // total number of chars we still need (by count)

        for (char c : t.toCharArray()) {
            if (need[c] == 0) { /* just counting unique isn't enough; we use 'required' differently below */ }
            need[c]++;
            required++; // count total needed characters (with multiplicity)
        }

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE, minL = 0;
        // We'll decrease 'required' as we satisfy characters and increase it when we drop needed characters.
        while (right < s.length()) {
            char rc = s.charAt(right);
            // If this char was needed (need[rc] > 0), consuming it reduces 'required'
            if (need[rc] > 0) required--;
            // Whether needed or not, we mark it consumed by decreasing need[rc]
            need[rc]--;
            right++;

            // When required == 0, window [left, right) contains all of t
            while (required == 0) {
                // Update best answer
                if (right - left < minLen) {
                    minLen = right - left;
                    minL = left;
                }
                // Try to shrink from the left
                char lc = s.charAt(left);
                need[lc]++; // put back lc
                // If after putting back, we now need lc (>0), window lost a required char
                if (need[lc] > 0) required++;
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minL, minL + minLen);
    }
}
