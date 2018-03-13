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

    void createMinimalHgtTree(int array[]) {

        Node node = minimalHgtTree(array,0,array.length-1);
        levelOrder(node);
    }

    Node minimalHgtTree(int array[], int start,int end){
        if(end < start) {
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(array[mid]);
        root.left = minimalHgtTree(array,start,mid-1);
        root.right = minimalHgtTree(array,mid+1,end);
        return root;
    }
    static Node insertVal(Node root,int val)
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
        System.out.println(root.data+" BF "+balance);
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
        System.out.println("newRoot left "+newRoot.left);
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

}
