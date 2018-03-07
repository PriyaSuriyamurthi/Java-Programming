package com.algorithmcode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList llist = new LinkedList();
        llist.append(3);
        llist.append(5);
        llist.append(8);
        llist.append(5);
        llist.append(10);
        llist.append(2);
        llist.append(1);
        //llist.append(9);
        //llist.append(10);
        //llist.append(11);
        //llist.prepend(3);
        llist.printList();
        llist.removeDuplicate();
        System.out.println("After removal");
        llist.printList();
        System.out.println("Linked list from kth to last node position " +  llist.returnkth(2).data);
        llist.printKth(llist.head,2);
        System.out.println("Kth position from last using wrapper code "+llist.printKt(llist.head,5).data);
        llist.deleteMiddleNode(llist.head.next.next.next);
        System.out.println("Printing after deleting middle node");
         llist.printList();
        LinkedList partitionList = llist.partitionLinkedList(5);
        System.out.println("After Partition");
        partitionList.printList();
        LinkedList sum1 = new LinkedList();
        LinkedList sum2 = new LinkedList();
        sum1.prepend(7);
        sum1.prepend(1);
        sum1.prepend(6);
        sum2.prepend(5);
        sum2.prepend(9);
        sum2.prepend(2);
        Node finalSumHead = sum1.sumLinkedList(sum1.head,sum2.head);
        System.out.println("Final Sum details :");
        sum1.printListHead(finalSumHead);
        Node finalReverseSum = sum1.sumReverseLinkedList(sum1.head,sum2.head,new Carry(), new LinkedList());
        System.out.println("Final Reverse Sum details :");
        sum1.printListHead(finalReverseSum);
        LinkedList isPal = new LinkedList();
        isPal.append('C');
        isPal.append('H');
        isPal.append('U');
        //isPal.append('R');
        isPal.append('H');
        isPal.append('C');
        /*isPal.append('L');
        isPal.append('A');
        isPal.append('M');*/
        System.out.println("Is the Linked List Palindrome "+isPal.isPalindrome(isPal.head));
        //llist.head = llist.partition(llist.head, 5);
        //llist.printList();
    }
}
