// Last updated: 2/2/2026, 3:13:14 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0 &&((n&(n-1))==0));
    }
}