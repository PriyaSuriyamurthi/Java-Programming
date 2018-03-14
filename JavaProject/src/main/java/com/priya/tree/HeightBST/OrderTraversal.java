package com.priya.tree.HeightBST;

public class OrderTraversal {

        static int height(Node root) {
            // Write your code here.
            int leftLength = 0, rightLength=0;
            if(root.left != null) {
                leftLength = height(root.left) + 1;
            }
            if(root.right != null) {
                rightLength = height(root.right) + 1;
            }
            return leftLength > rightLength? leftLength: rightLength;
        }


}
