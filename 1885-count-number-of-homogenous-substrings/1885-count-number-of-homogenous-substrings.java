class Solution {
    public int countHomogenous(String s) {

     int result = 0;
     int length = 0;
     int mod = (int)1e9+7;


     
     for(int i=0;i<s.length();i++){

       if(i > 0 && s.charAt(i) == s.charAt(i-1)){
        length+=1;
       } 
       else{
        length = 1;
       }

       result=(result+length)%mod;
     }

     return result;
    }
}