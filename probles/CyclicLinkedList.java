
import java.util.Scanner;

public class CyclicLinkedList {
    public static void Display(Node h1){
        Node temp=h1;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n=sc.nextInt();
        System.out.println("Enter the value of linked list nodes:");

        Node head = new Node(1);
        Node temp=head;
        for(int i=1; i<=n; i++){
            System.out.println("Enter the value of node "+i);
            int data=sc.nextInt();
            temp.next=new Node(data);
            temp=temp.next;     
        }
        if(n>2)
        temp.next=head.next.next;
        else
        temp.next=head.next;
        if(checkCycle(head)){
        System.out.println("Cyclic");
        int res=indexOfCycle(head);
        System.out.println("Index where cycle begin is: "+res);
        }
        else{

        System.out.println("Non Cyclic");
        Display(head);
        }
    }
    private static boolean checkCycle(Node h1){
        Node fast=h1;
        Node slow=h1;
       while(fast.next!=null){
          fast= fast.next.next;
          slow=slow.next;
          if(fast==null)
          return false;
        if(fast.next==slow)
        return true;
       }
   return false;
    }
    private static int indexOfCycle(Node h1){
        Node fast=h1;
        Node slow=h1;
       while(fast!=null){
          fast= fast.next.next;
          slow=slow.next;
          if(fast==slow)
          break;
         
    }
    Node temp=h1;
    int idx=0;
    while(temp!=slow)
    {
      temp=temp.next;
      slow=slow.next;
      idx++;
    }
    return idx;
}
}
