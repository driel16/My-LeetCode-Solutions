import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        // If they are already equal, no swap is needed
        if (s1.equals(s2)) return true;

        // Store the indices where the strings differ
        List<Integer> diffIndices = new ArrayList<>();
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffIndices.size();
                diffIndices.add(i);
            }
        }

        // To fix with exactly one swap, we MUST have exactly 2 differences
        if (diffIndices.size() != 2) return false;

        int i = diffIndices.get(0);
        int j = diffIndices.get(1);

        // Check if swapping s1[i] and s1[j] makes it equal to s2
        // This is true if s1[i] == s2[j] AND s1[j] == s2[i]
        return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
    }
}
