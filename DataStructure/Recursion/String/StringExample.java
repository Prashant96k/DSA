package Recursion.String;

public class StringExample {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String str1="Upgrad learning center Pune";
        String s1="Up";
        String s2="grad";

        System.out.println("length : "+str1.length());
        System.out.println("index : "+str1.indexOf('U'));
        System.out.println("UpperCase : "+str1.toUpperCase());
        System.out.println("LowerCase : "+str1.toLowerCase());

        String str2=str1.substring(2,7); //for printing specific word 
        System.out.println(str2.toUpperCase());

        String s3=s1+s2;
        System.out.println("First Method"+s3); //concatt

        System.out.println("Second Method"+s1.concat(s2));
  //Compare
        System.out.println("Compare1: "+s1.equals(s2));
        System.out.println("Compare2: "+s1.compareTo(s2));
        System.out.println("Compare2: "+s1!=s2);
    //trim to remove space
    String trm="                         upgrad";

    System.out.println(trm);
    System.out.println(trm.trim());


    // to rplace
    String sr="Up";
    System.out.println(sr.replace('U','P'));

    //split it give in array form
    String[] srplt=str1.split(" ");


    System.out.println("Split: "+srplt[2]);
    //Startwith and End with

    System.out.println(str1.startsWith("U"));
    System.out.println(str1.endsWith("N"));

    //to check empty
    System.out.println(str1.isEmpty());
    System.out.println(str1.isBlank());

    }
    
}
