package com.priya.tree.PostOrderTraversal;

public class Main {
    public static void main(String args[]) {
        Node newNode = new Node(3);
        newNode.insert(3);
        newNode.insert(5);
        newNode.insert(2);
        newNode.insert(4);
        newNode.insert(30);
        newNode.insert(5);
        newNode.insert(6);
        OrderTraversal inorder = new OrderTraversal();

        System.out.println("Post Order Traversal");
        inorder.printPostOrder(newNode);
    }
}
