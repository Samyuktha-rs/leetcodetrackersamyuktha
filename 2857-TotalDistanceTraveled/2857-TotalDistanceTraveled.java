// Last updated: 2/2/2026, 3:12:08 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
       int distance = 0;
        
        while (mainTank > 0) {
           
            if (mainTank >= 5) {
                distance += 50; 
                mainTank -= 5;
                
                
                if (additionalTank > 0) {
                    mainTank += 1;
                    additionalTank -= 1;
                }
            } else {
                
                distance += mainTank * 10;
                mainTank = 0;
            }
        }
        
        return distance;

 
    }
}