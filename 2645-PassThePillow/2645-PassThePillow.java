// Last updated: 2/2/2026, 3:12:19 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle=time/(n-1);
        int rem=time%(n-1);
        if(cycle%2==1){
            return n-rem;
        }else{
            return rem+1;
        }
    }
}