package CSWsortingMerQui.src.Question5;
import java.util.Scanner;
public class MAXPATHSUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array 1");
        int[] arr=new int[6];
        arr[0]=23;
        arr[1]=34;
        arr[2]=5;
        arr[3]=9;
        arr[4]=10;
        arr[5]=20;
        arr[6]=25;

        System.out.println("Enter the Array2");
        int[] arr1= {34,45,10,89,90};

        int[] temp=new int[7];

        System.out.println("using Loop");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]>arr1[j]&&arr[i]!=arr[j]) {
                    for (int x = 0; x < arr.length; x++) {
                        temp[x] = arr[i++];
                    }
                }
                    else if(arr[i]<arr1[j]&&arr[j]!=arr[i]){
                        for(int x=0;x<arr.length;x++){
                            temp[x]=arr[i++];
                    }
                }
                    else if(arr[i]==arr[j]){
                        
                }
            }
        }

    }
}
