package com.priya.tree.CheckBalanced;

public class OrderTraversal {

    static int heightNode(Node root) {
        if( root == null) {
            return -1;
        } else {
            return root.ht;
        }
    }

    static int setHeight(Node root) {
        if(root == null) {
            return -1;
        }
        else {
            return 1 + Math.max(heightNode(root.left), heightNode(root.right));
        }
    }

    static Boolean checkBalanced(Node root) {
        if(root == null) {
            return true;
        }
        if(checkBalanced(root.left) && checkBalanced(root.right)) {
            int balance = Math.abs(heightCheck(root.left) - heightCheck(root.right));
            if ( balance > 1) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }
    static int heightCheck(Node root) {
        if( root == null) {
            return -1;
        } else {
            root.ht = setHeight(root);
            return root.ht;
        }
    }

}
