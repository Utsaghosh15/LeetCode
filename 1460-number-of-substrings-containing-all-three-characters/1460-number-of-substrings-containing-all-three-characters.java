class Solution {
    public int numberOfSubstrings(String s) {


     int end = 0;
     int start = 0;
     int result = 0;
     char[] chars = s.toCharArray();
     HashMap<Character,Integer> map = new HashMap<>();


     while(end < chars.length){

      map.put(chars[end],map.getOrDefault(chars[end],0)+1);

      while(map.size() == 3){
       
       result+= chars.length-end;

       map.put(chars[start],map.get(chars[start])-1);

       if(map.get(chars[start]) == 0)
        map.remove(chars[start]);
       
       start+=1;
      }

      end+=1; 
    }
    
    return result;  
  }
}