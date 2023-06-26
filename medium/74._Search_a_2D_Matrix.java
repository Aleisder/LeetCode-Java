/*
 * https://leetcode.com/problems/search-a-2d-matrix/
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length - 1;
        int mid;

        while (r - l > 1) {
            mid = (l + r) / 2;
            int[] guess = matrix[mid];
            if (guess[0] < target)
                l = mid;
            else if (guess[0] > target)
                r = mid;
            else
                return true;
        }
        int m = matrix[r][0] > target ? l : r;

        l = 0;
        r = matrix[0].length - 1;

        while (l <= r) {
            mid = (l + r) / 2;
            int guess = matrix[m][mid];
            if (guess > target)
                r = mid - 1;
            if (guess < target)
                l = mid + 1;
            if (guess == target)
                return true;
        }
        return false;
    }
}