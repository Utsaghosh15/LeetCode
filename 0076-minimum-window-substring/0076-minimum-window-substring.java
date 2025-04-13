class Solution {
    public String minWindow(String s, String t) {

     if (s.length() < t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        int count = t.length();

        int i = 0, j = 0;
        while (j < s.length()) {
            char endChar = s.charAt(j);
            if (map.containsKey(endChar)) {
                if (map.get(endChar) > 0) {
                    count--;
                }
                map.put(endChar, map.get(endChar) - 1);
            }

            // Contract the window as much as possible while it's still valid
            while (count == 0) {
                if (j - i + 1 < minLen) {
                    minLen = j - i + 1;
                    minStart = i;
                }

                char startChar = s.charAt(i);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) > 0) {
                        count++;
                    }
                }
                i++;
            }
            j++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}