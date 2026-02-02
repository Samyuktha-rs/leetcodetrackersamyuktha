// Last updated: 2/2/2026, 3:12:23 PM
class Solution {
    public int pivotInteger(int n) {
        int total=(n*(n+1))/2;
        int s=(int)Math.sqrt(total);
        if((s*s)==total) return s;
        else return -1;
    }
}