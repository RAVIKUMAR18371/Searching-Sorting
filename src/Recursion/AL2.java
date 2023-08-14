package CSWsortingMerQui.src.Recursion;
import java.util.*;
public class AL2 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        System.out.println("Current arraylist: \t\t"+num);
        System.out.println("The reversed array list: "+reverseArrayList(num));
        System.out.println("Maximum element in the list: "+Collections.max(num));
        System.out.println("Minimum element in the list: "+Collections.min(num));

        System.out.print("List iterator reverse: ");
        ListIterator<Integer> rev = num.listIterator(num.size());

        while(rev.hasPrevious()){
            System.out.print(rev.previous()+" ");
        }
        System.out.println();

        Collections.swap(num, 2, 6);
        System.out.println("Arraylist after swapping: "+num);
    }
    static ArrayList<Integer> reverseArrayList(ArrayList<Integer> AL){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = AL.size() - 1; i >= 0; i--) {
            temp.add(AL.get(i));
        }
        return temp;
    }
}
