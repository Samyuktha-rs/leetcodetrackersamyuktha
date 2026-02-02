// Last updated: 2/2/2026, 3:13:01 PM
class Solution {
    public int arrangeCoins(int n) {
        int row =1;
        while(n>=row){
            n-=row;
            row++;
        }
        return row-1;
    }
}