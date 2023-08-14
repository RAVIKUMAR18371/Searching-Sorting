package CSWsortingMerQui.src.Recursion;
import java.util.Scanner;
public class power {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of x and n");
        int pow=power(2,5);
        System.out.println("the value of pow"+" "+pow);
    }
    static int power(int x,int n){
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        return x*power(x,n-1);
    }
}
