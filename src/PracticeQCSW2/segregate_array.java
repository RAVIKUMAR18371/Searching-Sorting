package CSWsortingMerQui.src.PracticeQCSW2;
import java.util.Arrays;
public class segregate_array {
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1};

        int j=0;

        Arrays.sort(arr);

        int[] temp=new int[arr.length];

        for(int i=1;i<arr.length;i+=2) {
            temp[j] = arr[i];
            j++;

        }
        for(int i=0;i<arr.length;i+=2){
            temp[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));



    }
}
