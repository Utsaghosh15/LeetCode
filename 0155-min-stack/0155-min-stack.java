class MinStack {
    
    Stack<int []> stack = new Stack<>();   

    public MinStack() {
      
    }
    
    public void push(int val) {

     if(!stack.isEmpty()){
      
      if(val < stack.peek()[1])
        stack.push(new int[]{val,val});
      else
        stack.push(new int[]{val,stack.peek()[1]});
          
     } 
     else{
       stack.push(new int[]{val,val}); 
     }  
    }
    
    public void pop() {

     if(!stack.isEmpty()){
       stack.pop(); 
     }   
    }
    
    public int top() {

     if(!stack.isEmpty())
      return stack.peek()[0]; 

     return -1;   
    }
    
    public int getMin() {

     if(!stack.isEmpty())
      return stack.peek()[1];

     return -1; 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */