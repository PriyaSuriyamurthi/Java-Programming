package com.priya.tree.CheckBalanced;


public class Main {
    public static void main(String args[]) {
        Node newNode = new Node(3);
        newNode.insert(7);
        newNode.insert(5);
        newNode.insert(2);
        newNode.insert(4);
        newNode.insert(30);
        newNode.insert(1);
        newNode.insert(6);
        OrderTraversal inorder = new OrderTraversal();
        System.out.println("BST is balanced "+inorder.checkBalanced(newNode));
    }
}
