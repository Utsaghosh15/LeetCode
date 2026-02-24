class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        
        int low = 1;
        int high = x;
        int result = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Use division to avoid integer overflow (instead of mid * mid)
            if (mid == x / mid) {
                return mid;  // perfect square
            } else if (mid < x / mid) {
                result = mid;  // mid might be the answer, but try larger
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return result;
    }
}