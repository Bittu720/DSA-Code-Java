class Node{
    int data;
    Node next;
    Node(int new_data){
        data=new_data;
        next=null;
    }
}
public class LL4rotatelinkedlistnaive {
   static Node rotate(Node head,int k){
    if(k==0||head==null)
    return head;
    for(int i=0;i<k;i++){
        Node curr=head;
        while(curr.next!=null)
        curr=curr.next;
        curr.next=head;
        curr=curr.next;
        head=head.next;
        curr.next=null;
    }
    return head;
   }
   static void printList(Node node){
    while(node!=null){
        System.out.print(node.data+" ");
        node=node.next;
    }
    System.out.println();
   }
   public static void main(String args[]){
 Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = rotate(head, 6);
        printList(head);
   } 
}
