import java.util.Stack;

public class Stackevenodd {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        int sum = 0;
        while (!st.isEmpty()) {
            if ((int) st.peek() % 2 != 0) {
                sum = sum + (int) st.pop();
            }else{
                st.pop();
            }
            
        }
        System.out.println(sum);

    }
}
