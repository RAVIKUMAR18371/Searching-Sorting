package CSWsortingMerQui.src.PracticeQCSW2;

import java.util.Scanner;
import java.util.*;
public class MAx_Pathsumn {
    static int MAXPATHSUM(int[] arr1, int[] arr2, int size1, int size2) {
        int i = 0, j = 0, result = 0, sum1 = 0, sum2 = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j])
                sum1 += arr1[i];
            else if (arr1[i] > arr2[j])
                sum2 += arr2[j];
            else {
                result = Math.max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;
                i = i++; //or you can only write the "i++"
                j = j++; //or only you can write the "j++"
            }
        }
        while (i < size1) {
            sum1 = arr1[i];
            i++;
        }
        while (j < size2) {
            sum2 = arr2[j];
            j++;
        }
        result += Math.max(sum1, sum2);

        return result;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the 1st array");
        int n=sc.nextInt();
        System.out.println("Enter the size of the 2nd array");
        int m=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[m];
        System.out.println("Enter the elements in the 1st array ");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements in the 2nd array");
        for(int p=0;p< arr2.length;p++){
            arr2[p]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        System.out.println("MAX sum is"+MAXPATHSUM(arr1,arr2,arr1.length,arr2.length));

    }
}
