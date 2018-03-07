package Partition;

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
        llist.append(9);
        llist.append(11);
        llist.printList();
        LinkedList partitionList = llist.partitionLinkedList(5);
        System.out.println("After Partition");
        partitionList.printList();
    }
}
