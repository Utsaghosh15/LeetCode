import java.util.*;

class Solution {

    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] needed = new int[256];
        int[] have = new int[256];

        for (char c : t.toCharArray()) {
            needed[c]++;
        }

        int required = t.length();
        int formed = 0;

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            have[c]++;

            if (needed[c] > 0 && have[c] <= needed[c]) {
                formed++;
            }

            while (formed == required) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                have[leftChar]--;

                if (needed[leftChar] > 0 && have[leftChar] < needed[leftChar]) {
                    formed--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}