import java.util.*;

public class StackSorting {
    public static void sortstack(Stack input){
        Stack tmStack=new Stack();
        
        while (!input.isEmpty()) {
            int tmp=(int)input.pop();
            while (!tmStack.isEmpty() && (int)tmStack.peek() > tmp) {
                input.push(tmStack.pop());
                
            }
            tmStack.push(tmp);

           
            
        }
        while(!tmStack.isEmpty()){
            input.push(tmStack.peek());
            tmStack.pop();
        }
    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(3);
        st.push(2);
        sortstack(st);
        while(!st.isEmpty()){
            System.out.print(st.peek()+" ");
            st.pop();
        }

    }
}
