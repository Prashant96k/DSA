import java.util.Stack;
public class Stackex {
    public static void main(String[] args) {
      Stack st=new Stack(); 
      st.push(1); 
      st.push(2); 
      st.push(3); 
      st.push(4); 
      st.push(5); 
      st.push(6); 
      st.push(7); 
      st.push(8); 
    //   System.out.println("Peek the element===  "+st.peek());
    //   System.out.println("check stack is empty===  "+st.isEmpty());
    //   System.out.println("size of stack===  "+st.size());
    //   int mid=st.size()/2+1;
    //   int counter=1;
    //   while (!st.isEmpty()) {
    //     if(counter==mid){
    //         System.out.println("middle Element  "+st.peek());
    //         break;

    //     }
    //     st.pop();
    //     counter++;
        
     // }

System.out.println("original stack");

    Stack st1=new Stack();

      while (!st.isEmpty()) {
       st1.push(st.peek());
       System.out.println(st.peek());
       st.pop();
      }


System.out.println("new stack");
int sum=0;
      while (!st1.isEmpty()) {
        System.out.println(st1.peek());
        sum=sum+(int)st1.pop();
      }
     
System.out.println("Sum of element   "+sum);
    //   while (!st.isEmpty()) {
    //     System.out.println(st.peek());
    //     st.pop();
        
    //   }

    }
    
}
