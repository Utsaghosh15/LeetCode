class Solution {
    public int[][] merge(int[] [] intervals) {

        // Step 1: sort by start
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[][] result = new int[intervals.length][2];
        int idx = 0;

        // Step 2: take first interval as current
        int start = intervals[0][0];
        int end   = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){

            if(intervals[i][0] <= end){
                // OVERLAP → extend end if needed
                end = Math.max(end, intervals[i][1]);
            }
            else{
                // NO OVERLAP → save current, move forward
                result[idx][0] = start;
                result[idx][1] = end;
                idx++;

                // new current interval
                start = intervals[i][0];
                end   = intervals[i][1];
            }
        }

        // Step 3: add last interval
        result[idx][0] = start;
        result[idx][1] = end;
        idx++;

        // Step 4: trim result to actual size
        return Arrays.copyOfRange(result, 0, idx);
    }
}