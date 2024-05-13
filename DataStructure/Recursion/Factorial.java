package Recursion;

public class Factorial {
    int fact=1;
    void Factorial(int i){
        while (i>0) {
            fact=fact*i;
            i--;
        } 
        System.out.println(fact);
    }
    int rFact(int x){
        if (x==1) {
            return 1;
            
        }else{
            return rFact(x-1)*x;
        }
    }
    public static void main(String[] args) {
        Factorial obj=new Factorial();
        obj.Factorial(5);
        int rfacct=obj.rFact(5);
        System.out.println(rfacct);
    }
}
