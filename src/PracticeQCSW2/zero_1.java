package CSWsortingMerQui.src.PracticeQCSW2;
import java.util.Arrays;
public class zero_1 {
    public static void main(String[] args) {
        System.out.println("The elements of the array:");
        int[] arr = {0, 1, 0, 0, 1, 1, 0, 1, 2, 0, 2, 1, 2};
        int cz = 0;
        int cz1 = cz;
        int cz2= cz1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cz++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cz1++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                cz2++;
            }

        }
        for(int i=0;i<cz;i++){
            arr[i]=0;
        }
        for(int i=cz;cz<cz1;cz++){
            arr[i]=1;
        }
        for(int i=cz1;cz1<cz2;cz1++){
            arr[i]=2;
        }

        System.out.println(Arrays.toString(arr));








      //  for (int cz2 = cz1;cz2<arr.length;cz2++){


    }
}
