class Solution {
    public int divisorSubstrings(int num, int k) {

     String s = String.valueOf(num);
     int n = s.length();
     int count = 0;

     for(int i=0;i <= n-k;i++){

      String sub = s.substring(i,i+k);
      int x = Integer.parseInt(sub);

      if(x != 0 && num % x == 0)
       count++;  
     } 

     return count;
    }
}