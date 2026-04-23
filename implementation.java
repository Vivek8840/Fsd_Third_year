public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist {
        Node head =null;
        Node tail = null;
        /**
         * @param value
         */
        void insertAtEnd(int value){
            Node temp= new Node(value);
            if(head==null){// check weather linkedlist empty or not 
                head = temp;
              
            }
            else{
            tail.next = temp;
            
            }//
            tail = temp;
        }
        void insertAtStart(int value){
            Node temp = new Node(value);
            if(head==null)
            {
                
                tail=temp;
            }
            else{
            temp.next=head;
            }
            
            head=temp;
            
        }
        int lengthL(){
            Node temp=head;
            int count=0;
            while(temp!=null){
            count++;
            temp=temp.next;
        }
            return count;
        }
        void insertAtIndex(int value,int idx){
            if(idx> lengthL())
            System.out.println("Index is out of bound");
            else if(idx==0)
            {
                insertAtStart(value);
                return;
            }
           else if(head==null && tail == null){
            System.out.println("Linked list is empty");
        }
            else{
                Node V = new Node(value) ;
                Node temp=head; 
                for(int i=0 ; i<idx-1; i++){
                    temp=temp.next;
                }
                
                V.next=temp.next;
                temp.next=V;

            }
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        void deleteStart(){
            Node temp = head.next;
            head = temp;


        }
        // void getAt(int idx){
        //     if(head == null)

        // }
        void deleteIndex(int idx){
            Node temp=head;
            Node v;
            for(int i=0; i<idx; i++){
                temp=temp.next;

            }
            if(temp.next==null)
            temp=null;
            else{
            v = temp;
            temp=v.next;
            }

        }

    }
    public static void main(String[] args) {
        
    
    linkedlist ll = new linkedlist();
    ll.insertAtEnd(5);
    ll.insertAtEnd(7);
    ll.insertAtStart(9);
    ll.insertAtStart(23);
    ll.display();
    System.out.println();
    ll.insertAtIndex(32, 5);
    ll.display();
    System.out.println();
    ll.insertAtIndex(32,2);
    System.out.println();
    ll.display();
    ll.insertAtIndex(60, 5);
    System.out.println();
    ll.display();
    System.out.println();
    ll.insertAtIndex(12, 0);
    ll.display();
    System.out.println( "Size of linkedlist is : "+ll.lengthL());
    ll.deleteStart();
    System.out.println();
    ll.display();
    System.out.println();
    ll.deleteIndex(3);
    ll.display();
    System.out.println( "Size of linkedlist is : "+ll.lengthL());
    ll.deleteIndex(6);
    ll.display();
   
    
    }
}
