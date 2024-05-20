package Searching;

public class recursionBinarySearch {
    static int reSearch(int arr[],int l,int h,int search){
        int mid;
        if(h>=l){
            mid=l+(h-l)/2;

            if(arr[mid]==search){
                return mid;
            }
            if(search<arr[mid]){
                return reSearch(arr, l, mid-1, search);
            }
            if(search>arr[mid]){
                return reSearch(arr, mid+1,h, search);

            }
        }
        return -1;
    }
   static void printresult(int result,int search){
    if(result!=-1){
        System.out.println("elment found  "+search+" at index "+result);
    }else{
        System.out.println("not found");
    }

   }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int len = arr.length;
        int low = 0;
        int high = len - 1;
        int search = 5;
        int result=reSearch(arr, low, high, search);
        printresult(result,search);
       

}
}
