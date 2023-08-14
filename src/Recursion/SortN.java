package CSWsortingMerQui.src.Recursion;
import java.util.Arrays;
import java.util.Scanner;

public class SortN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted array: "+ Arrays.toString(countingSort(arr)));
    }
    public static int[] countingSort(int[] arr) {
        int k = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > k) {
                k = x;
            }
        }
        int[] count = new int[k+1];
        for (int x : arr) {
            count[x]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        int[] sortedArr = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            int x = arr[i];
            sortedArr[count[x]-1] = x;
            count[x]--;
        }
        return sortedArr;
    }
}
