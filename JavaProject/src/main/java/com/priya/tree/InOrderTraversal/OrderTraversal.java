package com.priya.tree.InOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

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

        public void printPreOrder(Node headNode) {
            System.out.println(headNode.data);
            if(headNode.left != null) {
                printInOrder(headNode.left);
            }
            if(headNode.right != null) {
                printInOrder(headNode.right);
            }
        }

        public void printPostOrder(Node headNode) {
            if(headNode.left != null) {
                printInOrder(headNode.left);
            }
            if(headNode.right != null) {
                printInOrder(headNode.right);
            }
            System.out.println(headNode.data);
        }
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

    static Node lca(Node root,int v1,int v2)
    {
        /*Node head = root;
        Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
        while(head != null) {
            q1.add(head);
            if(v1 < head.data) {
                if(head.left != null) {
                    head = head.left;
                }
            } else if(v1 > head.data){
                if(head.right != null) {
                    head = head.right;
                }
            } else {
                break;
            }

        }
        head = root;
        while(head != null) {
            q2.add(head);
            if(v2 < head.data) {
                if(head.left != null) {
                    head = head.left;
                }
            } else if(v2 > head.data){
                if(head.right != null) {
                    head = head.right;
                }
            } else {
                break;
            }

        }
        Node returnNode = null;
        while(!q1.isEmpty() && !q2.isEmpty()) {
            if(q1.peek() == q2.peek()) {
                returnNode = q1.peek();
            }
            q1.remove();
            q2.remove();
        }
        return returnNode;
*/
        Node temp = root; 

        while (true) {
            if (temp.data > v1 && temp.data > v2) {
                temp = temp.left;
            } else if (temp.data < v1 && temp.data < v2) {
                temp = temp.right;
            } else {
                return temp;
            }
        }
    }
}
