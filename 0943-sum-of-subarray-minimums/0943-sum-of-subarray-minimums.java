class Solution {
    public int[] NextSmallerElement(int[] arr){

     Stack<Integer> stack = new Stack<>();
     int[] result = new int[arr.length];

     for(int i=arr.length-1;i>=0;--i){

      while(!stack.isEmpty() && arr[stack.peek()] > arr[i])
        stack.pop(); 
      

      if(stack.isEmpty())
       result[i] = arr.length;
      else
       result[i] = stack.peek(); 

       stack.push(i);
     }

     return result;
    }

    public int[] PreviousSmallerElement(int[] arr){

     Stack<Integer> stack = new Stack<>();
     int[] result = new int[arr.length];

     for(int i=0;i<arr.length;++i){

      while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])
        stack.pop(); 
      

      if(stack.isEmpty())
       result[i] = -1;
      else
       result[i] = stack.peek(); 

       stack.push(i);
     }

     return result;
    }
    
    public int sumSubarrayMins(int[] arr) {
        
     int[] nse = NextSmallerElement(arr);
     int[] pse = PreviousSmallerElement(arr);
     int mod = (int) 1e9 + 7;
     long total = 0;

     for(int i=0;i<arr.length;i++){

      int left = i - pse[i];
      int right = nse[i] - i;

      total += (long) (left * right)% mod * arr[i] % mod;
      total %= mod;
     }

     return (int) total;
    }
}