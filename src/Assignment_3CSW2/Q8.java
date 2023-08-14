package CSWsortingMerQui.src.Assignment_3CSW2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
}
