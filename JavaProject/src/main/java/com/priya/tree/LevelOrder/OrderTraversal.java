package com.priya.tree.LevelOrder;

import java.util.LinkedList;
import java.util.Queue;

public class OrderTraversal {
    void levelOrder(Node root) {
        Queue<Node> q =new LinkedList<Node>();
        q.add(root);
        int size = q.size();
        while(size > 0){
            Node node = q.poll();
            System.out.print(node.data + " ");
            if(node.left != null) {
                q.add(node.left);
            }
            if(node.right != null) {
                q.add(node.right);
            }
            size = q.size();
        }
    }
}
