package CSWsortingMerQui.src.Recursion;
import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        permutation(arr,0,n);
    }
    static void permutation(int[] arr, int i, int length){
        if (length == i) {
            printArray(arr, length);
            return;
        }
        int j;
        for (j = i; j < length; j++) {
            swap(arr, i, j);
            permutation(arr, i + 1, length);
            swap(arr, i, j);
        }
    }
    static void printArray(int[] arr, int length){
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
