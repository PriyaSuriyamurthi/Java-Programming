package com.priya.tree.InOrderTraversal;

public class Main {
    public static void main(String args[]) {
        Node newNode = new Node(4);
        newNode.insert(2);
        //newNode.insert(5);
        newNode.insert(7);
        newNode.insert(1);
        //newNode.insert(30);
        newNode.insert(3);
        newNode.insert(6);
        OrderTraversal inorder = new OrderTraversal();
        System.out.println("In Order Traversal");
        inorder.printInOrder(newNode);
        System.out.println("Pre Order Traversal");
        inorder.printPreOrder(newNode);
        System.out.println("Post Order Traversal");
        inorder.printPostOrder(newNode);
        System.out.println("height of longest node "+inorder.height(newNode));
        inorder.topView(newNode);
        System.out.println("Tree Traversal");
        inorder.levelOrder(newNode);
        System.out.println("LCA for 1 and 7 are "+inorder.lca(newNode,1,7).data);
    }
}
