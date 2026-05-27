class Solution {
    public int[][] kClosest(int[][] points, int k) {

    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < points.length; i++) {
            int dist = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);

            if (pq.size() < k) {
                pq.offer(new int[]{dist, i});
                continue;
            }

            if (pq.peek()[0] > dist) {
                pq.poll();
                pq.offer(new int[]{dist, i});
            }
        }

        int[][] result = new int[k][];
        int idx = 0;
        while (!pq.isEmpty())
            result[idx++] = points[pq.poll()[1]];

        return result;
    }
}