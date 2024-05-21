package Sorting;

public class BubleSort {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 9, 8 };
        
        for (int i = 0; i < arr.length; i++) {  //nmber of elements

            for (int j = 0; j < arr.length -i- 1; j++) { //how many times swapping the elemnet

                if (arr[j] > arr[j+ 1]) { //codition true Swap;

                  //  swap(arr[i], arr[i + 1]); //swap function
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
