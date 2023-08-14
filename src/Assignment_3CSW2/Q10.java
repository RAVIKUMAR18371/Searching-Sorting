package CSWsortingMerQui.src.Assignment_3CSW2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        int[] arr = {4, 12, 2, 5, 7, 10, 9};
        HashSet hs = new HashSet();
        for (int x : arr) {
            hs.add(x);

        }
       int d= minnum(arr, arr.length,hs);
        System.out.println("min miss num: "+d);
    }

    static int minnum(int[] arr, int size,HashSet hs) {
        for (int i = 2; i < arr.length - 1; i++) {
            if (!(hs.contains(i))) {
                //  System.out.println("the smallest possible missing number is "+ i);
                return i;

            }
        }
        return -1;
    }
}












