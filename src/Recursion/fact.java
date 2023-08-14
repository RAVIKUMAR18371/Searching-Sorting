package CSWsortingMerQui.src.Recursion;
import java.util.Scanner;
public class fact {
    /*
    System.out.println("the factorial value is"+fact(5));
    static int fact(int m){
        if(m==0)
            return 1;
        else
            m*fact(m-1);
    }
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x");
        int x = sc.nextInt();
        int faco = fact(x);
        System.out.println("the annswer of the factorial" + faco);
    }

    static int fact(int x) {
        if (x == 0)
            return 1;
        if (x < 0)
            System.out.println("no factorial");

        return x * fact(x - 1);



    }

    }


