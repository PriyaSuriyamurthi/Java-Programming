package com.priya.tree.MinimalHgtTree;

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
    void createMinimalHgtTree(int array[]) {

        Node node = minimalHgtTree(array,0,array.length-1);
        printInOrder(node);
    }

    Node minimalHgtTree(int array[], int start, int end){
        if(end < start) {
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(array[mid]);
        root.left = minimalHgtTree(array,start,mid-1);
        root.right = minimalHgtTree(array,mid+1,end);
        return root;
    }

}
