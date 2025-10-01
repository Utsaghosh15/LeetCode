class Solution {
    public int maxVowels(String s, int k) {

     int currVowel = 0;
     int maxVowel = 0;
     int end = 0;
     int start = 0;

     while((end-start)<k){
      
      if(s.charAt(end) == 'a' || s.charAt(end) == 'e' || s.charAt(end) == 'i' || s.charAt(end) == 'o' || s.charAt(end) == 'u')  
        currVowel++;

      end++; 
     }

     maxVowel = Math.max(currVowel,maxVowel);

     if(maxVowel == k)
       return k;

     while(end < s.length()){

      if(s.charAt(end) == 'a' || s.charAt(end) == 'e' || s.charAt(end) == 'i' || s.charAt(end) == 'o' || s.charAt(end) == 'u')  
        currVowel++;  

      if(s.charAt(start) == 'a' || s.charAt(start) == 'e' || s.charAt(start) == 'i' || s.charAt(start) == 'o' || s.charAt(start) == 'u')  
        currVowel--;

      maxVowel = Math.max(currVowel,maxVowel);


      
      end++;
      start++;
     }

     return maxVowel;    
    }
}