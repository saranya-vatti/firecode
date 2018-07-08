/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/
import java.util.*;
class TrieNode {
    Character c;
    Boolean isLeaf = false;
    HashMap<Character, TrieNode> children = new HashMap<>();
    public TrieNode() {}
    public TrieNode(Character c) {
        this.c = c;
    }
}

class Trie {
    private TrieNode root;
    
    // Implement these methods :
    public Trie() {
        root = new TrieNode();
    }
    public void insertWord(String word) {
        if(word == null || word.equals("")) return;
        if(root.c == null) root.c = word.charAt(0);
        int i=1;
        TrieNode curr = root;
        while(i<word.length()) {
            char ch = word.charAt(i);
            HashMap<Character, TrieNode> children = curr.children;
            if(!children.containsKey(ch)) {
                TrieNode child = new TrieNode(ch);
                children.put(ch, child);
                curr = child;
            } else {
                curr = children.get(ch);
            }
            i++;
        }
        curr.isLeaf = true;
    }
    public Boolean searchWord(String word) {
        TrieNode node = search(word);
        return node != null && node.isLeaf;
    }
    public Boolean searchPrefix(String word) {
        return search(word) != null;
    }
    public TrieNode search(String word) {
        if(word == null || word.length() == 0 || root==null) return null;
        TrieNode curr = root;
        int i=1;
        while(curr != null && i<word.length()) {
            curr = curr.children.get(word.charAt(i++));
        }
        return curr;
    }
    public void print() {
        if(root==null) return;
        Queue<TrieNode> qu= new LinkedList<TrieNode>();
        qu.add(root);
        while(!qu.isEmpty()) {
            Queue<TrieNode> childQueue = new LinkedList<TrieNode>();
            while(!qu.isEmpty()) {
                TrieNode curr = qu.remove();
                System.out.print(curr.c + "->");
                for(Map.Entry<Character, TrieNode> entry : curr.children.entrySet()) {
                    TrieNode node = entry.getValue();
                    if(node != null) {
                        if(!node.isLeaf) childQueue.add(node);
                        System.out.print(node.c);
                        if(node.isLeaf) System.out.print("|");
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
            qu = childQueue;
        }
    }
}
public class Main
{
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("AB");
        trie.insertWord("ABS");
        trie.insertWord("ADS");
        trie.insertWord("ADSD");
        trie.insertWord("ACS");
        trie.print();
        System.out.println(trie.searchWord("ACS"));
    }
}
