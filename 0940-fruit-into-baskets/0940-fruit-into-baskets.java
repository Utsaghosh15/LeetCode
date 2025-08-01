class Solution {
    public int totalFruit(int[] fruits) {

     HashMap<Integer,Integer> map = new HashMap<>();
     int end = 0;
     int start = 0;
     int result = 0;

     while(end < fruits.length){

       map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);

       if(map.size() > 2){
        
        map.put(fruits[start],map.get(fruits[start])-1);

        if(map.get(fruits[start]) == 0)
          map.remove(fruits[start]);

        start+=1;
       } 
    
      result = Math.max(result,end-start+1);
      end+=1;  
     }

     return result;   
    }
}