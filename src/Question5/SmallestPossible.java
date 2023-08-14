package CSWsortingMerQui.src.Question5;
import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
public class SmallestPossible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the "+n+"elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       HashMap<Integer,String> hm=new HashMap<>();
        hm.put(100,"Deepak");
        hm.put(101,"Rohan");
        hm.put(102,"Ravi");
        hm.put(103,"Rohit");
        hm.put(104,"Durga");
    }
}
