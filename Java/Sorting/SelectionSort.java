package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 10, 324, 4, 90, 9808 };

        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                    // System.out.println(min);
                }
                
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }

    }
}
