package CSWsortingMerQui.src.Recursion;
import java.util.Arrays;
import java.util.Scanner;

public class Wave_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Waveform array generated: " + Arrays.toString(waveForm(arr)));
    }

    // Time complexity: O(N)
    static int[] waveForm(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i] > arr[i - 1])
                swap(arr, i, i - 1);
            if (arr[i] > arr[i + 1])
                swap(arr, i, i + 1);
        }
        return arr;
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
