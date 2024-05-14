package Recursion.String;

public class vowels {
    public static void main(String[] args) {
        String st="Prashant";
        int len=st.length();
        char x=' ';
        for(int i=0;i<len;i++){
            x=st.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                System.out.println(x);
            }
        }
    }
}
