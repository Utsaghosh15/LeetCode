class Solution {

    // Keep your signature; use (row) as the city id, and (col) == row when calling.
    public void DFS(int row, int col, boolean[][] visited_array, int[][] isConnected) {
        // mark this city as visited using the diagonal cell
        if (visited_array[row][row]) return;
        visited_array[row][row] = true;

        int n = isConnected.length;

        // scan all possible neighbors (columns) in row = city
        for (int neighbor = 0; neighbor < n; neighbor++) {
            if (isConnected[row][neighbor] == 1 && !visited_array[neighbor][neighbor]) {
                // recurse with (neighbor, neighbor) to keep your method shape
                DFS(neighbor, neighbor, visited_array, isConnected);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[][] visited_array = new boolean[n][n]; // keep your 2D visited
        int result = 0;

        // iterate over cities; call DFS(city, city, ...) to match your signature
        for (int city = 0; city < n; city++) {
            if (!visited_array[city][city]) {
                result += 1;
                DFS(city, city, visited_array, isConnected);
            }
        }

        return result;
    }
}
