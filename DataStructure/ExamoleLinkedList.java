public class ExamoleLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    Node head;
    void insertFirst(int data){
        Node newNode=new Node(data);
        
        newNode.next=head;
        head=newNode;
        
    }
    void insertLast(int data){
        Node newNode=new Node(data);
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
     void inssertatmiddle(Node prev,int data){
        if(head==null){
            System.out.println("Error No elements in list");
        }
        Node newNode=new Node(data);
        newNode.next=prev.next;
        prev.next=newNode;

     }

     int midelement(Node head){
       Node slow_ptr=head; 
       Node fast_ptr=head;
       while (fast_ptr!=null && fast_ptr.next!=null) {
        fast_ptr=fast_ptr.next.next; //double speed
        slow_ptr=slow_ptr.next; //less speed
        
       }
       return slow_ptr.data; // printing data
     }
        
     

     
    void printdata(){
        Node curNode=head;
        while (curNode!=null) {
            System.out.println(curNode.data);
            curNode=curNode.next;
            
        }
    }
    public static void main(String[] args) {
        ExamoleLinkedList obj1=new ExamoleLinkedList();
        obj1.insertFirst(200);
        obj1.insertFirst(300);
        obj1.insertFirst(400);
        obj1.insertFirst(500);
        // obj1.printdata();
    //   obj1.insertLast(90);
    //     obj1.insertLast(80);
    //     obj1.insertLast(50);
    //     obj1.insertLast(40);
    //     obj1.insertLast(50);
    //     obj1.printdata();
        obj1.inssertatmiddle(obj1.head.next, 2);
        obj1.printdata();
        

      }  }
    

