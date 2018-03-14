package com.priya.tree.PostOrderTraversal;

public class OrderTraversal {

        public void printPostOrder(Node headNode) {
            if(headNode.left != null) {
                printPostOrder(headNode.left);
            }
            if(headNode.right != null) {
                printPostOrder(headNode.right);
            }
            System.out.println(headNode.data);
        }


}
