class WordDictionary {
    // A Node represents one letter in the tree
    private class Node {
        Node[] children = new Node[26];
        boolean isWord = false;        
    }

    private Node root;

    public WordDictionary() {
        root = new Node();
    }
    
    // Objective 3: Add an item to your "Dictionary"
    public void addWord(String word) {
        Node curr = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a'; 
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.isWord = true; 
    }
    
    public boolean search(String word) {
        return helper(word, 0, root);
    }

    // A helper function to handle the '.' (wildcard) logic
    private boolean helper(String word, int index, Node curr) {
        if (curr == null) return false;
        if (index == word.length()) return curr.isWord;

        char c = word.charAt(index);
        
        if (c == '.') {
            // Objective 1: Reduce errors by checking all possible letters
            for (Node child : curr.children) {
                if (child != null && helper(word, index + 1, child)) {
                    return true;
                }
            }
            return false;
        } else {
            // Search for the specific letter
            return helper(word, index + 1, curr.children[c - 'a']);
        }
    }
}
