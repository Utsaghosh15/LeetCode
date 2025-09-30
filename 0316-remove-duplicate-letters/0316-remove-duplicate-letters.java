class Solution {
    public String removeDuplicateLetters(String s) {

     int[] freq = new int[26];
     boolean[] visited = new boolean[26];
     Stack<Character> stack = new Stack<>();

     for(char ch : s.toCharArray())
      freq[ch-'a']+=1; 

     for(char ch : s.toCharArray()){

      freq[ch-'a']--;

      if(visited[ch-'a']){
        continue;
      }

      while(!stack.isEmpty() && ch < stack.peek() && freq[stack.peek()-'a'] > 0){
       visited[stack.peek()-'a'] = false;
       stack.pop();
      }

      stack.push(ch);
      visited[ch-'a'] = true; 
     }

        StringBuilder sb = new StringBuilder(stack.size());
        for (char c : stack) sb.append(c);
        return sb.toString();
    }
}