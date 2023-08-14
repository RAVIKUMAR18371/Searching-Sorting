package CSWsortingMerQui.src.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class DEC_to_BIN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack st=new Stack();
        System.out.println("Enter the elements you want to convert f45rom Decima to Bin");
        int x=sc.nextInt();
        int r;
        while(x>0){
             r=x%2;

            st.push(r);

            x=x/2;

        }
     while(!(st.isEmpty())) {
         System.out.println(st.pop());
     }
    }
}
