package CSWsortingMerQui.src.Recursion;
import java.util.Scanner;
public class MAX_pathsum {
    public static int maxPathSum(int[] arr1, int size1, int[] arr2, int size2) {
        int i = 0, j = 0, result = 0, sum1 = 0, sum2 = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i];
                i += 1;
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j];
                j += 1;
            } else {
                result += Math.max(sum1, sum2);
                result = result + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i += 1;
                j += 1;
            }
        }
        while (i < size1) {
            sum1 += arr1[i];
            i += 1;
        }
        while (j < size2) {
            sum2 += arr2[j];
            j += 1;
        }
        result += Math.max(sum1, sum2);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1st array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of 2nd array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Max Path Sum :: " + maxPathSum(arr1,
                arr1.length, arr2, arr2.length));
    }
}
