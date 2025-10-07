class Solution {
    public int findContentChildren(int[] g, int[] s) {

     int result = 0;
     int cookie_pointer = 0;
     int child_pointer = 0;
     Arrays.sort(g);
     Arrays.sort(s);

     while(child_pointer < g.length && cookie_pointer < s.length){
      
      if(s[cookie_pointer] >= g[child_pointer]){
       cookie_pointer++;
       child_pointer++; 
       result++;
      }
      else{
        cookie_pointer+=1;
      }
     }

     return result;   
    }
}