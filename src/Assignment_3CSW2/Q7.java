package CSWsortingMerQui.src.Assignment_3CSW2;
import java.util.*;
import java.util.HashSet;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        sc.nextLine();

        for(int i=0;i<arr.length-1;i++){
            HashSet hs=new HashSet();
            for(int j=i+1;j<arr.length;j++){
                int m=arr[j]-arr[i];
                hs.add(m);

                }
            System.out.println(hs);

            }
        }
    }

