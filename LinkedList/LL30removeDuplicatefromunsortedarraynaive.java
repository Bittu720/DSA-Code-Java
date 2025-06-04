class Node {
    int data;
    Node next;
    Node prev;
    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
public class LL30removeDuplicatefromunsortedarraynaive {
static Node removeDuplicates(Node head) {
        Node curr = head;
        while (curr != null) {
            Node temp = curr;
            while (temp.next != null) {
                if (temp.next.data == curr.data) {
                    Node duplicate = temp.next;
                    temp.next = temp.next.next;
                    if (temp.next != null)
                        temp.next.prev = temp;
                    duplicate = null;
                } 
              	else {
                    temp = temp.next;
                }
            }
            curr = curr.next;
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
    public static void main(String args[]) {
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