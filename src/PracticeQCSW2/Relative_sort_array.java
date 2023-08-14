
//Wrong code..................................................................
package CSWsortingMerQui.src.PracticeQCSW2;
import java.util.Arrays;
import java.util.Scanner;
public class Relative_sort_array {
    static void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The elements of the array");
        int[] arr={2,1,2,5,7,1,9,3,6,8,8};
        int[] arr2={2,1,8,3};
        int count2=0;
        int count1=count2+0;
        int count8=count1+0;
        int count3=count8+0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==2)
                count2++;

            if(arr[i]==1)
                count1++;

            if(arr[i]==8)
                count8++;

            if(arr[i]==3)
                count3++;
        }

        for(int i=0;i<count2;i++){
            arr[i]=2;
        }
        for(int i=count2;i<count1;i++){
            arr[i]=1;
        }
        for(int i=count1;i<count8;i++){
            arr[i]=8;
        }
        for(int i=count8;i<count3;i++){
            arr[i]=3;
        }

        for(int i=count3;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));






    }
}
