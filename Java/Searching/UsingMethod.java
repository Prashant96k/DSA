package Searching;

public class UsingMethod {
    static int binarySearch1(int arr[],int low,int high, int search ){
        while (low <= high) { // unless an until there is an only one size array
            int mid = low + (high - low) / 2;

            if (search == arr[mid]) {
               
                return mid;

        }
    }return -1;
}
    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int len = arr.length;
        int low = 0;
        int high = len - 1;
        int search = 22;
        int result=binarySearch1(arr, low, high, search);
        if(result!=-1){
            System.out.println("elment found"+result);
        }else{
            System.out.println("not found");
        }
}
}
