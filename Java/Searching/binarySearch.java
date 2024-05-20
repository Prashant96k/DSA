package Searching;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int len = arr.length;
        int low = 0;
        int high = len - 1;
        int search = 22;
        boolean result = false;
        while (low <= high) { // unless an until there is an only one size array
            int mid = low + (high - low) / 2;

            if (search == arr[mid]) {
                System.out.println("element found at "+mid);
                result = true;
                break;
            }
            if (search <= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        if (result == false) {
            System.out.println("element not found");

        }

    }
}
