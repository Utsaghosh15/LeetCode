class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxCount = 0, best = 0;

        for (int right = 0; right < s.length(); right++) {
            int idx = s.charAt(right) - 'A';
            freq[idx]++;
            maxCount = Math.max(maxCount, freq[idx]);

            // If we need to replace more than k chars, shrink from the left
            while ((right - left + 1) - maxCount > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}