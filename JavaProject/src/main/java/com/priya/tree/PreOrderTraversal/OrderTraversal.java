package com.priya.tree.PreOrderTraversal;

public class OrderTraversal {
        public void printPreOrder(Node headNode) {
            System.out.println(headNode.data);
            if(headNode.left != null) {
                printPreOrder(headNode.left);
            }
            if(headNode.right != null) {
                printPreOrder(headNode.right);
            }
        }

}
