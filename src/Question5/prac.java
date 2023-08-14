package CSWsortingMerQui.src.Question5;
import java.util.Arrays;
import java.util.Scanner;
public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        //    int[] arr=new int[]{12,34,15,16,2,4,3};
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextInt();

            Arrays.sort(arr);
            for (int j = 0; j < arr.length - 1; j++) {
                System.out.println(arr[j]);
            }
            // System.out.println("the sorted array is: "+Arrays.toString(arr));
        }
    }
}
