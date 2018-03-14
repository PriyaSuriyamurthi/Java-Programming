package com.priya.tree.CheckBST;

import java.util.LinkedList;
import java.util.Queue;

public class OrderTraversal {

    Queue<Node> q1 = new LinkedList<Node>();
    boolean checkBST(Node root) {
        int prev =0;
        return inOrderTraversal(root,prev);
        /*while(!q1.isEmpty()) {
            Node compare = q1.peek();
            q1.remove();
            if(q1.isEmpty()) {
                break;
            }
            if(compare.data >= q1.peek().data) {
                return false;
            }
        }*/

    }
    Boolean inOrderTraversal(Node root, int prev) {
        if(root.left != null) {
            inOrderTraversal(root.left,prev);
        }
        if(prev >= root.data) {
            return false;
        }
        prev = root.data;
        if(root.right != null) {
            inOrderTraversal(root.right,prev);
        }
        return true;
    }

}
