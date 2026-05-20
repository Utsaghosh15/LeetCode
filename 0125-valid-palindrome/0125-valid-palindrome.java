class Solution {
    public boolean isPalindrome(String s) {

     if(s.length() == 0)
      return true;   

     String cleaned = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

     System.out.println(cleaned);
     
     int start = 0;
     int end = cleaned.length()-1;

     while(start < end){
      
      if(cleaned.charAt(start) != cleaned.charAt(end))
       return false;

      end-=1;
      start+=1;  
     }

     return true;   
    }
}