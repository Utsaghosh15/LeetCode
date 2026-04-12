class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int[][] result = new int[intervals.length + 1][2];
        int idx = 0;

        for(int i = 0; i < intervals.length; i++){

            // STEP 1: current interval ends before newInterval starts
            // no overlap, add current interval
            if(intervals[i][1] < newInterval[0]){
                result[idx][0] = intervals[i][0];
                result[idx][1] = intervals[i][1];
                idx++;
            }

            // STEP 2: current interval starts after newInterval ends
            // no overlap, add newInterval first then current
            else if(intervals[i][0] > newInterval[1]){
                result[idx][0] = newInterval[0];
                result[idx][1] = newInterval[1];
                idx++;
                newInterval[0] = intervals[i][0];
                newInterval[1] = intervals[i][1];
            }

            // STEP 3: overlap! expand newInterval
            else{
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        // add the last newInterval
        result[idx][0] = newInterval[0];
        result[idx][1] = newInterval[1];
        idx++;

        return Arrays.copyOfRange(result, 0, idx);
    }
}