package CSWsortingMerQui.src.PracticeQCSW2;

import java.util.Scanner;

public class QuickSort {
    static void swap(int x, int y) {
        int temp = x;
        x = y;
        y=temp;
    }
    static void quickSort(int[] arr,int m,int n){
        if(m<n){
            int w=partition(arr, 0, arr.length-1);
            quickSort(arr,m,w-1);

            quickSort(arr,w+1, arr.length-1);
        }
    }

    static int partition(int[] arr, int p, int r) {
        int i = p - 1;
        int j = p;
        for (j = p; j < r; j++) {
            if (arr[j] > arr[r]) {
                j++;
            } else if (arr[j] < arr[r]) {
                i++;
                swap(arr[i], arr[j]);
                j++;
            }
        }
        swap(arr[r],arr[i+1]);
        return i+1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 12, 65, 45, 13, 15, 9, 5, 7, 34};
        int size = arr.length-1;

        quickSort(arr,0,arr.length-1);

    }

}
