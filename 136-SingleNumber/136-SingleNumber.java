// Last updated: 2/2/2026, 3:13:26 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; 
        }
        return result;


    }
}