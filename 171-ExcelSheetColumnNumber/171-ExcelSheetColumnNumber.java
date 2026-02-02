// Last updated: 2/2/2026, 3:13:21 PM
class Solution {
    public int titleToNumber(String columnTitle) {
         int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1; // Convert letter to number
            result = result * 26 + value;
        }
        return result;

    }
}