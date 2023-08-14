package CSWsortingMerQui.src.Question5;
import java.util.Scanner;
public class Bin_rec{

    public static int binaryrec(int[] arr,int x,int y,int ele){

        int mid=(x+y)/2;
      //  System.out.println("Enter the element which needed to found");
        if(mid==ele)
            return mid;
        if(mid<ele)
            return binaryrec(arr,mid+1,arr.length-1,ele);
        else
            return binaryrec(arr,0,mid-1,ele);
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements in the array");
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        int i=binaryrec(arr,0,arr.length-1,40);

         if(i!=-1){
            System.out.println("the element is found at index: "+i);
        }
         else
             System.out.println("the element is not found");

    }
    }


