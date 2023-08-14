package CSWsortingMerQui.src.PracticeQCSW2;
import java.util.Scanner;
import java.util.*;
public class MAX_circular_kadane {
    static int max_cirsum(int[] arr,int size){
      int cirsum=0;
      int maxsum=0;
      for(int i=0;i<size;i++){
          cirsum+=arr[i];
          if(cirsum>maxsum){
              maxsum=cirsum;
          }
          else if(cirsum<0)
              cirsum=0;
          else if(arr[i]==arr[size-1]){
              int p=0;
              p++;
              arr[i++]=arr[p++];
          }
      }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the  elements in the array: ");
        int[] arr=new int[n];
        int i=0;
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        /*
        int[] temp=new int[n];
        System.out.println("Copying the array");
        for(int m=0;m<arr.length;m++) {
            temp[m] = arr[i];
        }
         */
            System.out.println("The array max circular sum will be "+max_cirsum(arr,arr.length));


    }
}
