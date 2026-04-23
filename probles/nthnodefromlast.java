
// import java.lang.classfile.components.ClassPrinter;
import java.util.Scanner;

public class nthnodefromlast {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;

        }
    }
    
    static void DisplayNode(Node temp){
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node nthNodeFromEnd(Node head, int idx ){
       
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;

        }
        // System.out.println(size);
        int k=size-idx+1;//value of inndex from statring of linked list
        temp=head;
        int i=1;
        while(i<k){
        temp=temp.next;
        i++;
    }

    return temp;
}
public static Node nthNodefromlastEasy(Node head,int idx ){
    Node slow=head;
    Node fast=head;
    for(int i=1; i<=idx; i++){
    fast=fast.next;
    }

    while(fast!=null){
       slow= slow.next;
       fast = fast.next;
    }
    return slow;
}
public static  Node removingNthNodefromlast(Node head,int idx ){
    Node slow=head;
    Node fast=head;
    for(int i=1; i<=idx; i++){
    fast=fast.next;
    }
    if(fast==null){
  
    head=head.next;
    return head;
    }
    else {
    
    while(fast.next!=null){
       slow= slow.next;
       fast = fast.next;
    }
   
   
    slow.next=slow.next.next;

}
    return head;
    
}
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Node head = new Node(100);
    Node a = new Node(90);
    Node b = new Node(80);
    Node c = new Node(70);
    Node d = new Node(60);
    Node e = new Node(50);
    head.next=a;
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    Node temp=head;
    System.out.print("Enter the index which you want :");
    int n=sc.nextInt();
    DisplayNode(head);
System.out.println();
    Node thenode= nthNodeFromEnd(head,n);
    System.out.println("The value at index "+n+" from last is "+thenode.data);
    Node idxnode=nthNodefromlastEasy(head, n);
    System.out.println("The value at index "+n+" from last is "+idxnode.data);
    System.out.println("After removing "+n+" from end , Linked List becomes :");
   head= removingNthNodefromlast(head, n);
    DisplayNode(head);
System.out.println();
 }

}
