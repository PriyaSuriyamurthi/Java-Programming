package com.priya.tree.TopView;

public class OrderTraversal {
        static int count = 0;
        void topView(Node root) {
            if(root.left == null) {
                System.out.print(root.data + " ");
            }
            if(root.left != null) {
                count++;
                topView(root.left);
                count--;
                System.out.print(root.data + " ");
            }
            if(count == 0) {
                while (root.right != null) {
                    root = root.right;
                    System.out.print(root.data + " ");
                }
            }
        }

}
