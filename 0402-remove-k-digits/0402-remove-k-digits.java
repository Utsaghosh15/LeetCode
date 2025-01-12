class Solution {
    public String removeKdigits(String num, int k) {

     char[] numchar = num.toCharArray();
     Stack<Integer> stack = new Stack<>();

     for(int i=0;i<numchar.length;i++){

      int currentDigit = numchar[i] - '0';  

      while(!stack.isEmpty() && k>0 && stack.peek() > currentDigit){
       stack.pop();
       k--; 
      }

      stack.push(currentDigit);
     }   
     
     StringBuilder result = new StringBuilder();

     while(k>0 && !stack.isEmpty()){
      stack.pop();
      k--;  
     } 

     while(!stack.isEmpty())
      result.append(stack.pop());

     result.reverse();

     while(result.length() > 0 && result.charAt(0) == '0')
       result.deleteCharAt(0); 

     return result.length() > 0 ? result.toString() : "0";
    }
}