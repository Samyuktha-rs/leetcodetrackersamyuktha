// Last updated: 2/2/2026, 3:13:09 PM
class Solution {
    public int missingNumber(int[] nums) {
          int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;


    }
}