import java.util.Stack;
public class stackoddpopout {
    public static void main(String[] args) {
        Stack stac=new Stack();
        stac.push(1);
        stac.push(2);
        stac.push(3);
        stac.push(4);
        stac.push(5);
        stac.push(6);
        stac.push(7);
        stac.push(8);
        stac.push(9);
        stac.push(10);
        while (!stac.isEmpty()) {
            if((int)stac.peek()%2!=0){
                System.out.println(stac.peek());
            }
            stac.pop();
            
        }
        
    }
}
