class Solution {
    public boolean isPalindrome(String s) {

     s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
     char[] sArray = s.toCharArray();
     int start = 0;
     int end = sArray.length-1;

     while(start < end){

      if(sArray[start] != sArray[end])
       return false;
      

      start++;
      end--;   
     }

     return true;   
    }
}