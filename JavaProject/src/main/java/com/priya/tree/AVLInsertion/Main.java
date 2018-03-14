package com.priya.tree.AVLInsertion;


public class Main {
    public static void main(String args[]) {
        Node newNode = new Node(3);
        newNode.insert(4);
        newNode.insert(2);
        newNode.insert(5);
        OrderTraversal inorder = new OrderTraversal();
        System.out.println("Tree Traversal");
        inorder.insertVal(newNode,6);
        inorder.printInOrder(newNode);
    }
}
