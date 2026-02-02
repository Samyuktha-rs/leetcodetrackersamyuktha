// Last updated: 2/2/2026, 3:12:44 PM
class Solution {
    public int subtractProductAndSum(int n) {
      int product = 1;
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10;   // extract last digit
            product *= digit;     // multiply into product
            sum += digit;         // add into sum
            n /= 10;              // remove last digit
        }
        
        return product - sum;

  
    }
}