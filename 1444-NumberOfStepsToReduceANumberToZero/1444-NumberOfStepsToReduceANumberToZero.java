// Last updated: 2/2/2026, 3:12:42 PM
class Solution {
    public int numberOfSteps(int num) {
         int steps = 0;
        
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2; 
            } else {
                num -= 1;   
            }
            steps++;
        }
        
        return steps;


    }
}