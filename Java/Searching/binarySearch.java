package Searching;
import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int len=arr.length;
        int l=0;
        int h=len-1;
        int search=22;
        boolean result=false;
        while(l<=h){
            int mid=l+(h-l)/2;

            if(search==arr[mid]){
                System.out.println("element found");
                result=true;
                break;
            }
            if(search<=arr[mid]){
                h=mid-1;
            }else{
                l=mid+1;
            }
        
        } if (result==false) {
            System.out.println("element not found");
            
        }
        
    }
}
