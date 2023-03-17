package hw5;

import java.util.Arrays;

public class Task53 {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 4, 6, 9, 9, 6, 2, 6, 3, 1, 4, 7, 8, 2, 7, 3, 1, 8, 6, 3 };
        Heapsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Heapsort(int arr[]) {
        int len = arr.length;

        for (int i = len / 2 - 1; i >= 0; i--)
            heapify(arr, len, i);

        for (int i = len - 1; i >= 0; i--)
        {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        
        if (left < n && arr[left] > arr[largest]) 
            largest = left;

        
        if (right < n && arr[right] > arr[largest])
        
            largest = right;
        
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
