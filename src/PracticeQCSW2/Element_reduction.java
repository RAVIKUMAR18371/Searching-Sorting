package CSWsortingMerQui.src.PracticeQCSW2;
import java.util.*;
public class Element_reduction {
    public static void main(String[] args) {
        int[] arr={5,7,3,8,4,2};
        int[] temp=arr;
        Arrays.sort(temp);
        int count=0;
        count=arr.length;
        reduceArray(arr,temp);


    }


    static void reduceArray(int[] arr,int[] temp){
        Arrays.sort(arr);
        int n=arr.length;
       for(int j=0;j<n;j++) {
           for (int i = 0; i < n; i++) {
               if (temp[j] <= arr[i]) {
                   arr[i] = arr[i] - temp[j];
               }
           }
                temp=arr;
               HashSet hs=new HashSet();
               for(int x:arr){
                   hs.add(x);
               }
           System.out.println(hs);

       }

       /*
            int count=0;
            for(int i=0;i<n;i++){
                if(arr[i]>0){
                    count++;
                }
            }

        */

        }

    }

