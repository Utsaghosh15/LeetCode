class Solution {
    public boolean isPalindrome(String s) {
 
     int start = 0;
     int end = s.length()-1;

     while(start < end){

      if(s.charAt(start) == ' ' || !Character.isLetterOrDigit(s.charAt(start))){
        start++;
        continue;
      }
      
      if(s.charAt(end) == ' ' || !Character.isLetterOrDigit(s.charAt(end))){
        end--;
        continue;
      }

      if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
        return false;

      start++;
      end--;    
     }

    //  while(start < end){

    //   if(sArray[start] != sArray[end])
    //    return false;
      

    //   start++;
    //   end--;   
    //  }

     
     return true;   
    }
}