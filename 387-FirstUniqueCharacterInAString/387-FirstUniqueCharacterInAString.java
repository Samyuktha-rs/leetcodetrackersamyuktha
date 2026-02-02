// Last updated: 2/2/2026, 3:13:03 PM
class Solution {
    public int firstUniqChar(String s) {
        for(int i=0; i<s.length(); i++){
            boolean flag= true;
            for(int j = 0; j<s.length(); j++){
                if(i != j && s.charAt(i) == s.charAt(j)){
                flag = false;
                break;
                }
            }
            if(flag == true) return i;
        }
        return -1; 
    }
}