package Recursion;

public class Recurex {
    void printName(int i){
        if(i==6){
            return;
        }
       System.out.println(i);
       printName(i+1);
       System.out.println(i);
       
    }
    public static void main(String[] args) {
        Recurex obj=new Recurex();
        obj.printName(0);
    
}
}
