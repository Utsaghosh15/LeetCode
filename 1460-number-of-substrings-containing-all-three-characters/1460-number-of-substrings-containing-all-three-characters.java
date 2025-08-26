class Solution {
    public int numberOfSubstrings(String s) {


     int end = 0;
     int result = 0;
     int[] arr = {-1,-1,-1};


     while(end < s.length()){
  
      char ch = s.charAt(end);
      arr[ch - 'a'] = end;

      if(arr[0] != -1 && arr[1] != -1 && arr[2] != -1)
        result += 1 + Math.min(arr[0],Math.min(arr[1],arr[2]));

      end+=1;
     } 
    
    return result;   

  }
}