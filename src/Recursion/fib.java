package CSWsortingMerQui.src.Recursion;
import java.util.Scanner;
public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The "+n+"th fibonacci number is: "+rfib(n));
    }
    static int rfib(int n){
        if(n==0)
            return 0;
        else if (n==1)
            return 1;
        return rfib(n-1) + rfib(n-2);
    }
}
