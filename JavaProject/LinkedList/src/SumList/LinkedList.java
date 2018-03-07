package SumList;

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
