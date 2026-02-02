// Last updated: 2/2/2026, 3:13:25 PM
class Solution {
public:
    int trailingZeroes(int n) {
       int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;

  
    }
};