package com.priya.tree.MergeTree;


public class Main {
    public static void main(String args[]) {
        Solution soln = new Solution();
        TreeNode t1 = new TreeNode(1);
        t1.insert(3);
        t1.insert(2);
        t1.insert(5);
        TreeNode t2 = new TreeNode(2);
        t2.insert(1);
        t2.insert(3);
        t2.insert(4);
        t2.insert(7);
        soln.mergeTrees(t1,t2);
    }
}
