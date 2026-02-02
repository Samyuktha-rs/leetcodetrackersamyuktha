// Last updated: 2/2/2026, 3:12:58 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int n =nums.length;
       int[] res = new int[n];
       for(int i=0;i<n;i++){
        res[i] = -1;
        for(int j=1; j<n;j++){
            if(nums[i] < nums[(i+j)%n]){
                res[i] = nums[(i+j)%n];
                break;
                }
           }
        } 
        return res;
    }
}