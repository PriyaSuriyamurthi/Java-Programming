package com.priya.tree.LCA;

public class OrderTraversal {
    static Node lca(Node root, int v1, int v2)
    {
        Node temp = root;
        while (true) {
            if (temp.data > v1 && temp.data > v2) {
                temp = temp.left;
            } else if (temp.data < v1 && temp.data < v2) {
                temp = temp.right;
            } else {
                return temp;
            }
        }
    }

}
