package Linkedlist;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Pra {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void printdata() {
        Node newNode = head;
        while (newNode != null) {
            System.out.println(newNode.data);
            newNode = newNode.next;

        }

    }


    int lengthLinked(){
        
        Node last=head;
        int count=0;
        while (last!=null) {
            count++;
            last=last.next;

            
        }
        return count;
    }

    boolean Search(Node headNode,int searchData){
        Node current=headNode;

        while (current!=null) {
            if(current.data==searchData){
                return true;
            }

            current=current.next;
            
        }
        return false;
    }

    public static void main(String[] args) {
        Pra obj = new Pra();
        obj.insertFirst(4);
        obj.insertFirst(5);
        obj.insertFirst(6);
        obj.insertFirst(8);
        obj.printdata();

        int len=obj.lengthLinked();
        System.out.println("length of the linked list "+len);

        boolean result=obj.Search(obj.head, 6);
    System.out.println(result);
        if(result==true){
            System.out.println("found");
        }else{
            System.err.println("No found");
        }
    }
}
