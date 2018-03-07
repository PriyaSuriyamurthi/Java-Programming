package RemoveDuplicates;

//Create a class LinkedList with various methods/functions
//like append, prepend, remove Duplicates
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

    // Print the LinkedList
    public void printList(){
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
