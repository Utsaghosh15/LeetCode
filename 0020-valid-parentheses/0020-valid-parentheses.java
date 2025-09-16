class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If opening bracket, push to stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } 
            // If closing bracket, check stack
            else {
                if (stack.isEmpty()) return false; // No opening bracket available

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false; // Mismatch
                }
            }
        }

        // If stack is empty at the end → valid
        return stack.isEmpty();  
    }
}