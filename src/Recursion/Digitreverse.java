package CSWsortingMerQui.src.Recursion;
import java.util.Scanner;
public class Digitreverse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x=4375;
         reverse(4375);
        System.out.println("the reverse of this number is"+ reverse(x));
    }
    static int reverse(int x){
        if(x<10)
            System.out.println(x);
        else
        reverse(x%10);

return reverse(x%10);
    }
}
