package com.priya.tree.AVLInsertion;

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
   
    static Node insertVal(Node root, int val)
    {
        if(root == null) {
            root = new Node(val);
            root.ht = setHeight(root);
            return root;
        }
        if(val <= root.data) {
            root.left = insertVal(root.left,val);
        } else {
            root.right =  insertVal(root.right,val);
        }
        int balance = heightNode(root.left)-heightNode(root.right);
        if (balance > 1 ) {
            if(heightNode(root.left.left) >= heightNode(root.left.right)) {
                root = rightRotate(root);
            } else {
                root.left = leftRotate(root.left);
                root = rightRotate(root);
            }

        } else if(balance < -1) {
            if(heightNode(root.right.right) >= heightNode(root.right.left)) {
                root = leftRotate(  root);
            } else {
                root.right = rightRotate(root.right);
                root = leftRotate(root);
            }
        }
        else {
            root.ht = setHeight(root);
        }
        return root;

    }
    static int heightNode(Node root) {
        if( root == null) {
            return -1;
        } else {
            return root.ht;
        }
    }

    static Node rightRotate(Node root) {
        Node newRoot = root.left;
        root.left = newRoot.right;
        newRoot.right = root;
        root.ht = setHeight(root);
        newRoot.ht = setHeight(newRoot);
        return newRoot;
    }

    // A utility function to left rotate subtree rooted with x
    // See the diagram given above.
    static Node leftRotate(Node root) {
        Node newRoot = root.right;
        root.right = newRoot.left;
        newRoot.left = root;
        root.ht = setHeight(root);
        newRoot.ht = setHeight(newRoot);
        return newRoot;
    }

    static int setHeight(Node root) {
        if(root == null) {
            return -1;
        }
        else {
            return 1 + Math.max(heightNode(root.left), heightNode(root.right));
        }
    }
    int count =0;
    public int longestUnivaluePath(Node root) {
        if(root == null) {
            return 1;
        }
        System.out.println("root is "+root.right.data);
        if(root.left != null && root.data == root.left.data) {
            System.out.println("left is "+root.left.data);
            count += longestUnivaluePath(root.left);
        }
        if(root.right != null && root.data == root.right.data) {
            System.out.println("right is "+root.right.data);
            count += longestUnivaluePath(root.right);
        }
        System.out.println(count);
        return count;
    }


}
