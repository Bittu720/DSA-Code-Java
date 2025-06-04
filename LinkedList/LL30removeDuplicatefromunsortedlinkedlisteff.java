import java.util.HashSet;
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
public class LL30removeDuplicatefromunsortedlinkedlisteff {
 static Node removeDuplicates(Node head) {
        HashSet<Integer> hashSet = new HashSet<>();
        Node curr = head;
        while (curr != null) {
            if (hashSet.contains(curr.data)) {
                if (curr.prev != null)
                    curr.prev.next = curr.next;
                if (curr.next != null)
                    curr.next.prev = curr.prev;
                Node temp = curr;
                curr = curr.next;
                temp = null;
            }
            else {
                hashSet.add(curr.data);
                curr = curr.next;
            }
        }
        return head;
    }
    static void printList(Node head) {
      	Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(2);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.prev = head.next.next.next;
        head = removeDuplicates(head);
        printList(head);
    }
}