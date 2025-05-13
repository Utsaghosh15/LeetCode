class Solution {
    public int totalFruit(int[] fruits) {

     int start = 0;
     int end = 0;
     int type = 0;
     int ans = 0;
     HashMap<Integer,Integer> map = new HashMap<>();

     while(end < fruits.length){

      map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);

      while(map.size() > 2){
       
       map.put(fruits[start],map.get(fruits[start])-1);
       

       if(map.get(fruits[start]) == 0){
        map.remove(fruits[start]);
       }
       start+=1;
      }

      ans = Math.max(ans,end-start+1);

      end+=1;       
     }

     return ans;
    }
}