package CSWsortingMerQui.src.Assignment_3CSW2;
import java.util.Scanner;
import java.util.HashSet;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the 2nd array: ");
        int m = sc.nextInt();
        System.out.println("Enter the elements in the 2nd array: ");
        int[] arr1 = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        HashSet hs=new HashSet();
        for(int x:arr){
            hs.add(x);
        }
        for(int c:arr1){
            hs.add(c);
        }
        System.out.println("The union of the 1st and 2nd array: ");
        System.out.println(hs);
        System.out.println();



        HashSet HS =new HashSet();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    int p=arr[i];
                    HS.add(p);
                }
            }
        }
        System.out.println("The intersection of the 1st and 2nd array: ");
        System.out.println(HS);
    }
}
