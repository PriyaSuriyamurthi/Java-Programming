package RemoveDuplicates;

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
        llist.append(3);
        llist.printList();
        llist.removeDuplicate();
        System.out.println("After removal");
        llist.printList();
    }
}
