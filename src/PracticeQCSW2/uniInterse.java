package CSWsortingMerQui.src.PracticeQCSW2;
import java.util.*;
public class uniInterse{
    public static void main(String[] args) {
        int[] arr2 = {2, 9, 5, 1};
        int[] arr1 = {7 , 1 , 5 , 6};
        union(arr2, arr1);
        intersection(arr2,arr1);
    }
    static void union(int[] arr2,int[] arr1) {
        HashSet hs = new HashSet();
        for (int m : arr2) {
            hs.add(m);
        }
            for (int x : arr1) {
                hs.add(x);

        }
        System.out.println("Union will be "+hs);
    }

    static void intersection(int[] arr2,int[] arr1){
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    System.out.println("Intersection will be "+arr1[j]);
                }
            }
        }
    }

}