package CSWsortingMerQui.src.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class Ass2_Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        ArrayList<Integer> al=new ArrayList();
        al.add(5);
        al.add(13);
        al.add(12);
        al.add(10);
        al.add(3);
        al.add(2);
        al.add(8);
        al.add(9);
        al.add(6);

        System.out.println(al);
        System.out.println("Enter the checking element: ");
        int x=sc.nextInt();

        if(al.contains(x)){
            System.out.println("the element are present at index: "+al.indexOf(x));

        }
        else
            System.out.println("The element are not present");

        System.out.println("Enter the removing index element");
        int j=sc.nextInt();
        al.remove(j);

        System.out.println(al);

        if(al.isEmpty()){
            System.out.println("The arraylist is empty");
        }
        else
            System.out.println("The arraylist is not empty");
    }
}
