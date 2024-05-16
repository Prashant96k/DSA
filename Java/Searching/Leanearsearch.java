package Searching;

import java.util.Scanner;

public class Leanearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the searcha element");
        int search=sc.nextInt();
        boolean result=false;
        for (int i = 0; i < n; i++) {
            if(search==arr[i]){
                System.out.println("elemnt found at index : "+i);
                result =true;
                break;
            }

}
if(result==false){
    System.out.println("element not found");
}
}
}
