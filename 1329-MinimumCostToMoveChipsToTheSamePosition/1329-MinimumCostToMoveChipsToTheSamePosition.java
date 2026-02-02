// Last updated: 2/2/2026, 3:12:46 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
         int evenCount = 0;
        int oddCount = 0;
        
        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        return evenCount<oddCount?evenCount:oddCount;

    }
}