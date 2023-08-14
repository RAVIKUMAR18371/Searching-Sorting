package CSWsortingMerQui.src.Recursion;
import java.util.Scanner;
public class MaxCircularSum {
    public static int maxCircularSum(int[] arr, int size){
        int sumAll = 0;
        int currVal = 0;
        int maxVal;
        for(int i = 0; i< size ; i++){
            sumAll += arr[i];
            currVal += (i*arr[i]);
        }
        maxVal = currVal;
        for(int i= 1; i< size; i++){
            currVal = ( currVal + sumAll ) - ( size * arr[size-i] );
            if (currVal > maxVal){
                maxVal = currVal;
            }
        }
        return maxVal;
    }
    /* Testing code */
    public static void main(String[] args) {
//        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("MaxCircularSum: " + maxCircularSum(arr,
                arr.length));
    }
}
