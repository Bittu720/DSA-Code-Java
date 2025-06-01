class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class LL24singlycheckedpalindromeeff {
static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    static boolean isIdentical(Node n1, Node n2) {
        while (n1 != null && n2 != null) {
            if (n1.data != n2.data)
                return false;
            n1 = n1.next;
            n2 = n2.next;
        }
        return true;
    }
    static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;
        Node slow = head, fast = head;
        while (fast.next != null 
               && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = reverseList(slow.next);
        slow.next = null;
        boolean ret = isIdentical(head, head2);
        head2 = reverseList(head2);
        slow.next = head2;
        return ret;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        boolean result = isPalindrome(head);
        if (result)
            System.out.println("true");
              else
            System.out.println("false");
    }
}