class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // If 'R', we increase the balance
            // If 'L', we decrease the balance
            if (s.charAt(i) == 'R') {
                balance++;
            } else {
                balance--;
            }
            
            // Balance hits 0, it means we found a balanced substring
            if (balance == 0) {
                count++;
            }
        }
        return count;
    }
}
