package com.priya.tree.AVLInsertion;


public class Main {
    public static void main(String args[]) {
        Node newNode = new Node(5);
        newNode.insert(4);
        newNode.insert(1);
        newNode.insert(5);
        newNode.insert(5);
        OrderTraversal inorder = new OrderTraversal();
        System.out.println("Tree Traversal");
        //inorder.insertVal(newNode,6);
        //inorder.printInOrder(newNode);
        System.out.println("Count is "+inorder.longestUnivaluePath(newNode));
    }
}
