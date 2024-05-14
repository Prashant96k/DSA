package Recursion.String;

public class palindrome {
    public static void main(String[] args) {
        String orignal = "aba";
        String Rev = "";
    
        for (int i = orignal.length()-1; i>=0; i--) {
            Rev=Rev+orignal.charAt(i);
            System.out.println(Rev);


        }
        if(Rev.equals(orignal)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");
        }
        

    }
}
