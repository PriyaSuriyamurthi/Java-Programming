package ReturnKthtoLast;

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
        llist.append(10);
        llist.append(11);
        llist.prepend(3);
        llist.printList();
        System.out.println("Linked list from 2nd to last node position " +  llist.returnkth(2).data);
        llist.printKth(llist.head,2);
    }
}
