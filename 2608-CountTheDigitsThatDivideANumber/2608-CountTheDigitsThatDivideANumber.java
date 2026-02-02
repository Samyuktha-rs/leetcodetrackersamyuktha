// Last updated: 2/2/2026, 3:12:21 PM
class Solution {
    public int countDigits(int num) {
         int count = 0;
        String s = String.valueOf(num);
        
        for (char c : s.toCharArray()) {
            int digit = c - '0';   
            if (num % digit == 0) {
                count++;
            }
        }
        
        return count;


    }
}