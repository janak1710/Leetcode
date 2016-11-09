class TrieNode {
    char ch;
    boolean isLeaf;
    HashMap<Character, TrieNode> map = new HashMap<Character, TrieNode>();
    // Initialize your data structure here.
    public TrieNode() {
        
    }
    
    public TrieNode(char ch){
        this.ch = ch;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode curr = root;
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            TrieNode next = null;
            HashMap<Character, TrieNode> map = curr.map;
            if(map.containsKey(c)){
                next = map.get(c);
            } else {
                next = new TrieNode(c);
                map.put(c, next);
            }
            curr = next;
        }
        curr.isLeaf = true;
        
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode curr = root;
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            TrieNode next = null;
            HashMap<Character, TrieNode> map = curr.map;
            if(map.containsKey(c)){
                next = map.get(c);
            } else {
                return false;
            }
            curr = next;
        }
        return curr.isLeaf;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(int i = 0; i<prefix.length(); i++){
            char c = prefix.charAt(i);
            TrieNode next = null;
            HashMap<Character, TrieNode> map = curr.map;
            if(map.containsKey(c)){
                next = map.get(c);
            } else {
                return false;
            }
            curr = next;
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");