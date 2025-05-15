class Solution {
    public int characterReplacement(String s, int k) {

     int start = 0;
     int end = 0;
     int maxfreq = 0;
     int maxlen = 0;
     int[] freq = new int[26];

     while(end < s.length()){

      freq[s.charAt(end) - 'A']++;
      maxfreq = Math.max(maxfreq,freq[s.charAt(end) - 'A']);

      if((end-start+1)-maxfreq > k){
       freq[s.charAt(start) - 'A']--;
       maxfreq = 0;
       start+=1; 
      }

      if((end-start+1)-maxfreq <= k)
       maxlen = Math.max(maxlen,end-start+1);
      
      end+=1;
     }
     return maxlen;
    }
}