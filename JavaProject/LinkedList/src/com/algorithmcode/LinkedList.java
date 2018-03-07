package com.algorithmcode;

//Create a class LinkedList with various methods/functions
//like append, prepend, remove Duplicates, PrintKth
public class LinkedList {
    Node head;
    //append method is used to add nodes to the end
    //of the linked List that is to the tail
    public void append(int data) {
        Node current = head;
        if(head == null) {
            head = new Node(data);
            return;
        }
        while(current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
        return;
    }
    //Prepend method is used to add nodes to
    //the head of the LinkedList
    public void prepend(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        } else {
            Node n1 = new Node(data);
            n1.next = head;
            head = n1;
            return;
        }
    }
    // Using Runner Technique to remove duplicates from
    // unsorted Linked List
    public void removeDuplicate() {
        Node current = head;
        Node compare = head;
        while(current.next != null) {
            while (compare.next != null) {
                if (current.data == compare.next.data) {
                    compare.next = compare.next.next;
                } else {
                    compare = compare.next;
                }
            }
            current = current.next;
            compare = current;
        }
    }
    // return Kth node from the Last node of the LinkedList
    // Use 2 pointers to find the Kth node from the tail node
    public Node returnkth(int position) {
        //Usual method to find the index of the tail node
        //and then find Kth position
        /*Node current = head;
        int llIndex = 0;
        while(current.next != null) {
            current = current.next;
            llIndex++;
        }
        position = llIndex - position;
        current = head;
        while(position != 0) {
            if(current.next != null) {
                current = current.next;
                position--;
            } else {
                return -1;
            }
        }
        return current.data;*/
        Node p1 = head;
        Node p2 = head;
        for(int index=0; index < position; index++) {
            if(p1.next != null) {
                p1 = p1.next;
            } else {
                return null;
            }
        }
        while(p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
    // Cannot return both index and Node details by normal method
    // Using wrapper method to return Index along with the node details
    public Node printKt(Node head, int position) {
        Index idx = new Index();
        return printKt(head,position,idx);
    }

    public Node printKt(Node head, int position,Index idx) {
        if(head == null) {
            return null;
        }
        Node current = printKt(head.next,position,idx);
        idx.value = idx.value + 1;

        if(idx.value == position) {
            return head;
        }
        return current;
    }
    // Recursive calling of the method to find the tail and then
    // calculate the index value. Compare it with K value
    public int printKth(Node head, int position) {
        if( head == null) {
            return 0;
        }
        int index = printKth(head.next, position) +1;
        if(index == position) {
            System.out.println(position + " from Last in LinkedList " + head.data);
        }
        return index;
    }
    //Remove the middle node when only the access to middle
    // node was provided. Copy the data from the next node
    // and remove the next node
    public Boolean deleteMiddleNode(Node current) {
        if(current == null || current.next == null) {
            return false;
        }
        current.data = current.next.data;
        current.next = current.next.next;
        return true;
    }
    //Partition the linkedList based on the Partition Value.
    //Move all the data less than the Partition value to the
    //head and move the others to tail. This was done after
    //creating new LinkedList
    public LinkedList partitionLinkedList(int partitionVal) {
            Node current = head;
            LinkedList partitionList = new LinkedList();
            while(current != null) {
                if(current.data < partitionVal) {
                    partitionList.prepend(current.data);
                } else {
                    partitionList.append(current.data);
                }
                current = current.next;
            }
            return partitionList;
    }
    //Without creating new linkedlist, move the lesser value to
    //head and other values to tail
    public Node partition(Node node, int x) {
        Node head = node ;
        Node tail = node;

        /* Partition list */
        while (node != null) {
            Node next = node.next;
            if (node.data < x) {
                /* Insert node at head. */
                node.next = head;
                head = node;
            } else {
                /* Insert node at tail. */
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;

        return head;
    }
    //Sum of 2 Linked List with 1's at the head position
    public Node sumLinkedList(Node head1, Node head2) {
        LinkedList finalSum = new LinkedList();
        int remainder, sum=0;
        while (head1 != null && head2 != null) {
            remainder = (head1.data + head2.data)%10;
            finalSum.append(sum + remainder);
            sum = (head1.data + head2.data)/10;
            head1 = head1.next;
            head2 = head2.next;
        }
        return finalSum.head;
    }
    //Sum of 2 LinkedList with 1's at the tail position
    public Node sumReverseLinkedList(Node head1, Node head2, Carry carry, LinkedList finalReverseSum) {
        if(head1 == null && head2 == null) {
            return null;
        }
        sumReverseLinkedList(head1.next, head2.next, carry, finalReverseSum);
        int addValue = head1.data + head2.data + carry.carry;
        carry.carry = addValue / 10;
        addValue %= 10;
        finalReverseSum.prepend(addValue);
        return finalReverseSum.head;
    }

    //Check if a LinkedList is Palindrome
    Node left;
    public Boolean isPalindrome(Node right) {
        left = head;
        if (right == null) {
            return true;
        }
        Boolean isPal = isPalindrome(right.next);
        if(isPal == false) {
            return false;
        }
        Boolean isPal1 = (left.data == right.data);
        left = left.next;
        return isPal1;
    }

    public int lengthOfLinkedList(Node head) {
        int length = 0;
        while(head == null) {
            ++length;
            head = head.next;
        }
        return length;
    }
    // Print the LinkedList
    public void printList(){
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void printListHead(Node head) {
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
