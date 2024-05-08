package Linkedlist;

public class LinkedlisExampleInsertAtFirst{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    void inseratthebegining(int data){
        Node newNode=new Node(data); //Creating new node and giving data
        newNode.next=head;//givin next part the adreess
        head=newNode; //updating the newnode as head node

    }
    void Printdata(){ //travesal in linked list
        Node newNode=head; //intiazization
        while (newNode!=null) { // condition
            System.out.println(newNode.data);
            newNode=newNode.next;//increment
            
        }

    }
    public static void main(String[] args) {
        LinkedlisExampleInsertAtFirst obj1=new LinkedlisExampleInsertAtFirst();
        obj1.inseratthebegining(10);
        obj1.inseratthebegining(20);
        obj1.inseratthebegining(30);
        obj1.inseratthebegining(40);
        obj1.Printdata();
    }
}
