package CSWsortingMerQui.src.Recursion;
import java.util.*;
public class ArrLIst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> S = new ArrayList<>();
        S.add("A");
        S.add("B");
        S.add("C");
        S.add("B");
        S.add("E");
        S.add("A");
        Iterator<String> iter = S.iterator();
        System.out.println("The list has: ");
        for (String a : S)
            System.out.println(a);
        System.out.println();
        for (; iter.hasNext(); ) {
            System.out.println(iter.next());
        }
        for (int i = 0; i < S.size(); i++) {
            System.out.println(S.get(i));
        }
        System.out.print("Enter the element to be searched: ");
        String X = sc.next();
        if(S.contains(X)){
            System.out.println("The first index of "+X+"= "+S.indexOf(X));
            System.out.println("The last index of "+X+"= "+S.lastIndexOf(X));
        } else {
            System.out.println("The element does not exist.");
        }
    }

}
