package hw3;

import java.util.Arrays;

public class Task31 {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 3, 7, 9, 4, 6, 2, 6, 3, 3, 4, 7, 8, 1, 7, 3, 5, 8, 6, 4 };
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) { 

        int len = arr.length;
        if (len == 1)
            return;

        int mid = len / 2;
        int[] larr = new int[mid];          
        int[] rarr = new int[len - mid];    

        for (int i = 0; i < mid; i++) {
            larr[i] = arr[i];
        }
        for (int i = 0; i < len - mid; i++) {
            rarr[i] = arr[i + mid];
        }
        mergeSort(larr);        
        mergeSort(rarr);        
        merge(arr, larr, rarr);
    }

    private static void merge(int[] arr, int[] larr, int[] rarr) {
        int ll = larr.length;
        int lr = rarr.length;
        int i = 0;
        int j = 0;
        int ind = 0;

        while (i < ll && j < lr) {
            if (larr[i] < rarr[j]) {
                arr[ind] = larr[i];
                i++;
                ind++;
            } else {
                arr[ind] = rarr[j];
                j++;
                ind++;
            }
        }
        while (i < ll) {                    
            arr[ind] = larr[i];
            i++;
            ind++;
        }
        while (j < lr) {
            arr[ind] = rarr[j];     
            j++;
            ind++;
        }
    }
}
