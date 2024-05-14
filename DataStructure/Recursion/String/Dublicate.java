package Recursion.String;

public class Dublicate {
    public static void main(String[] args) {
        String lb1 = "HellHo y yyn uuw";
        int len = lb1.length();
        int flag=0;
        for (int i = 0; i <= len - 1; i++) {
            flag=0;
            for (int j = i + 1; j < len - 1; j++) {
                if (lb1.charAt(i) == lb1.charAt(j)) {
                    System.out.println(lb1.charAt(i));
                    break;
                }
                
            }
        }
    }
}
