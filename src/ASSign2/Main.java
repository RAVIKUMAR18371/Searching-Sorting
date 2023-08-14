package CSWsortingMerQui.src.ASSign2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the center of circle");
        CircleType c = new CircleType();
        System.out.println("Enter X Coordinate");
        double x=sc.nextDouble();
        System.out.println("Enter Y coordinate");
        double y=sc.nextDouble();
        c.setCenter(3);
        System.out.println("Enter radius of circle");
        double radius=sc.nextDouble();
        c.setRadius(5);
        System.out.println("Radius of the circle is set to"+c.GetRadius());



    }
}
