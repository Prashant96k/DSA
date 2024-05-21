package Sorting;

public class BublesortUsigMethod {

    static void Swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void Bssort(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // number of elements
            for (int j = 0; j < arr.length - i - 1; j++) { // how many times swapping the element
                if (arr[j] > arr[j + 1]) { // condition true Swap;
                    Swap(arr, j, j + 1); // swap function
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 92, 9, 8 };
        Bssort(arr);
    }
}
