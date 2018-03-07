package SumList;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
    }
}
