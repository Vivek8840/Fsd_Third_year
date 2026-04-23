// package Linked List;
import java.util.*;
public class intro {
    public static int lengthll(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    // public static insertAtTail(Node head){

    // }
    public static void displaycr(Node head){
        if(head ==null)
        return;
        
            displaycr(head.next); //   -->
        System.out.print(head.data+ " ");
       
    
    }
    public static void displayr(Node head){
        if(head ==null)
        return;
        else{
        System.out.print(head.data+ " ");
        displayr(head.next);
        }
    }
    public static void display (Node head){
        Node temp =head;
        while (temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public static class Node{
        int data; // value
        Node next;// address of next node
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        // Node x=new Node( 0);
        // System.out.println(x.data);
        // System.out.println(x);
        // System.out.println(x.next);
        Node a =  new Node(5);
        System.out.println(a.next);
        Node b =  new Node(20);
        Node c =  new Node(10);
        Node d =  new Node(15);
        
        Node e =  new Node(25);
        a.next=b;
        System.out.println(a.next);//-->intro$Node@723279cf
        System.out.println(b);    //--> intro$Node@723279cf
        b.next=c;
        c.next=d;
        d.next = e;
  // Insertion 
   Node x = new Node(50);
// loction of this node   -- 3rd index
     b.next=x;
     x.next=c;
     // at index 0
     Node y= new Node(30);
     y.next=a;

     // at last index
     Node z = new Node(100);
     e.next = z;
     // Linked List --> 30 5 20 50 10 15 25 100
     //TYpe of Linked List
     //1--> Singly Linked List
     // #2--> Doubly Linked List
     // #3--> Circular Liked List4
     Node temp =  y;
     System.out.println(temp.data);
    //  for(int i=0; i<8; i++){
    //     System.out.print( temp.data +" ");
    //     temp = temp.next;
    //  }
    // while(temp!=null){
    //  System.out.print(temp.data+" ");
    //  temp=temp.next;
    
    // }
     //Displaying a linked list using function 
     display(y);
     System.out.println();
     // displaying a lnked list using recursive function
     displayr(y);
     System.out.println("\n\n");
     displaycr(y);
    // Length of linked list
    System.out.println();
   int l =lengthll(y);
   System.out.println("Length of Linked list "+l);
    }
}
