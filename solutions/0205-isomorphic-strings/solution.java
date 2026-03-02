class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Use two arrays to store the last seen positions of characters
        // 256 covers all standard ASCII characters
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // If the last seen positions don't match, the mapping is broken
            if (mapS[charS] != mapT[charT]) {
                return false;
            }

            // Update the position (we use i + 1 because the default array value is 0)
            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }

        return true;
    }
}
