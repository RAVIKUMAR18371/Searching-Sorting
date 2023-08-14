package CSWsortingMerQui.src;

import java.util.Scanner;
public class Palindrome_check {
      static boolean  palindr(int[] arr,int i,int j) {
          for (int p = 0; p < arr.length; p++) {
              if (arr[i++] == arr[j--])
                  return true;
              if (arr[i++] != arr[j--])
                  return false;
          }
          return palindr(arr,i++,j--);

      }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("palindrome "+palindr(arr,0,arr.length-1));


    }
}
