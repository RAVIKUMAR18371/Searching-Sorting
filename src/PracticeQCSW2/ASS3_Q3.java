package CSWsortingMerQui.src.PracticeQCSW2;
import java.util.Arrays;
public class ASS3_Q3 {
    public static void main(String[] args) {
        System.out.println("the array is:");
        int count=0;
        int j=0;
        int[] arr={7,4,3,1,6,9,8,10};
        int[] temp=new int[arr.length];
        int x=6;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] <= x) {
                count++;


                temp[j] = arr[i];
                j++;
            }
        }
            int i=j;
                temp[j]=arr[i];

        System.out.println(Arrays.toString(arr));

    }
}
