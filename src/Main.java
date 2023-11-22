

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NullPointerException {
        Random random = new Random(0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size List:");
        int n = scanner.nextInt();
        ForwardList list = new ForwardList();
        ForwardList list_2 = new ForwardList();
        for (int i = 0; i < n; i++) {
        list.push_front(random.nextInt(100));
        }
        for (int i = 0; i < n; i++) {
        list_2.push_back(random.nextInt(100));
        }
        //list.print();
        System.out.println();

       // list.push_back(99999);
        list.print();
       // list.pop_front();
        list.print();
        try {
            list.pop_back();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        try {
            list.pop_back();
            list_2.pop_front();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        list.print();
        /*System.out.print("Enter value : ");
        int value = scanner.nextInt();
        System.out.println();
        System.out.print("Enter index : ");
        int index = scanner.nextInt();
        list.erase(index);
        list.print();*/

 //       list.revers();
  //      list.print();
//ForwarList list2 = new ForwarList(list);



       // list.pop_back();
        //list.print();
        //list.clear();
        long start_time = System.nanoTime();
        ForwardList list2 = new ForwardList(list);
        long end_time = System.nanoTime();
        System.out.println("List copy %f seconds ".formatted((double)(end_time-start_time)*1e-9));
       // list2.print();
    }
}