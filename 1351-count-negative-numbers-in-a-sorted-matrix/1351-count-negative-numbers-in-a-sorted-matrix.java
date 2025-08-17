class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            count += countNegInRow(grid[i], n);
        }
        return count;
    }

    private int countNegInRow(int[] row, int n) {
        int low = 0, high = n - 1;
        int firstNeg = n; 

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] < 0) {
                firstNeg = mid;
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }

        return n - firstNeg; 
    }
}
