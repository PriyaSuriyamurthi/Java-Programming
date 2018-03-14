package com.priya.tree.MinimalHgtTree;


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
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        inorder.createMinimalHgtTree(array);
   }
}
