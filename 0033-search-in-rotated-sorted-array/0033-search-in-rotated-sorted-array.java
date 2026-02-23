class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;  // bug fix: should be length-1, not length

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) return mid;

            // Left half is sorted
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;  // target is in left half
                } else {
                    low = mid + 1;   // target is in right half
                }
            }
            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;   // target is in right half
                } else {
                    high = mid - 1;  // target is in left half
                }
            }
        }

        return -1;
    }
}