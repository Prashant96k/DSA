package Linkedlist;

public class InsertionFromLast {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    void InsertionFromLastlink(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node last=head;
        while (last.next!=null) {
            last=last.next;
            
        }
        last.next=newNode;

    }
    void Printdata(){ //travesal in linked list
        Node newNode=head; //intiazization
        while (newNode!=null) { // condition
            System.out.println(newNode.data);
            newNode=newNode.next;//increment
            
        }

    }
    public static void main(String[] args) {
        InsertionFromLast obj=new InsertionFromLast();  
        obj.InsertionFromLastlink(12);      
        obj.InsertionFromLastlink(16);      
        obj.InsertionFromLastlink(17);      
        obj.InsertionFromLastlink(18);      
        obj.Printdata();
    }
}
