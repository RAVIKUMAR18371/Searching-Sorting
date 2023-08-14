package CSWsortingMerQui.src.Question_7;
import java.util.Scanner;
     class B implements I1 {
         static int max_Count=0;
         Scanner sc = new Scanner(System.in);

         public void display() {
             System.out.println("Name");

         }

         public int count() {
             System.out.println("Enter Name of person");
             String Name = sc.next();
             for (int i = 0; i < Name.length(); i++) {
                 max_Count++;
             }
             return max_Count;
         }
     }


