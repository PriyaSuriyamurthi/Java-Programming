package com.priya.tree.InOrderTraversal;

public class OrderTraversal {
    public void printInOrder(Node headNode) {
        if(headNode.left != null) {
            printInOrder(headNode.left);
        }
        System.out.println(headNode.data);
        if(headNode.right != null) {
            printInOrder(headNode.right);
        }
    }

}
