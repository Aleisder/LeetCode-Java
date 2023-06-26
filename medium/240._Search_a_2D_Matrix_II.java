/*
 * https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        while (i <= matrix.length - 1 && j >= 0) {
            int guess = matrix[i][j];
            if (guess > target)
                j--;
            else if (guess < target)
                i++;
            else return true;
        }
        return false;
    }
}
