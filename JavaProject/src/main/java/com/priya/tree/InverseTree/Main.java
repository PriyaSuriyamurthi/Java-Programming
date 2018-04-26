package com.priya.tree.InverseTree;


public class Main {
    public static void main(String args[]) {
        Node newNode = new Node(4);
        newNode.insert(2);
        newNode.insert(1);
        newNode.insert(3);
        newNode.insert(7);
        newNode.insert(6);
        newNode.insert(9);
        Solution soln = new Solution();
        System.out.println(soln.invertTree(newNode).data);

    }
}
