package Linkedlist;

import java.util.Stack;

public class StackevenElement {
    public static void main(String[] args) {
        Stack stak=new Stack();
        stak.push(1);
        stak.push(2);
        stak.push(3);
        stak.push(4);
        int sum=1;
        while(!stak.isEmpty()){
            if((int)stak.pop()==2){
                System.out.println(stak.peek());
                stak.pop();
                
            }
        }
    }
}
