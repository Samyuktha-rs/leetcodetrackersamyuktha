// Last updated: 2/2/2026, 3:12:20 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0, digitSum = 0;
        for (int num : nums) {
            elementSum += num;
            for (int x = num; x > 0; x /= 10) digitSum += x % 10;
        }
        return Math.abs(elementSum - digitSum);


    }
}