package com.priya.tree.InverseTree;

public class Solution {
    public Node invertTree(Node root) {
        if(root == null) {
            return null;
        }
        Node nodeRoot = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = nodeRoot;
        return root;
    }
}
