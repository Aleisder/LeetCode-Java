/*
 * https://leetcode.com/problems/sort-colors/
 */

class Solution {
    public void sortColors(int[] nums) {
        var countArr = new int[3];
        for (int elem: nums)
            countArr[elem]++;
        int index = 0;
        for (int elem = 0; elem < 3; elem++) {
            for (int j = 0; j < countArr[elem]; j++) {
                nums[index] = elem;
                index++;
            }
        }
    }
}
