package CSWsortingMerQui.src.PracticeQCSW2;

public class smallest_missing_number {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,5,6,7};

        for(int i=0;i<arr.length;i++){
            if( arr[i]!=(i+1)){
                System.out.println("the missing number will be: "+(i+1));
            }
        }
    }

}
