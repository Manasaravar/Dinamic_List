

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size List:");
        int n = scanner.nextInt();
        ForwardList list = new ForwardList();
        for (int i = 0; i < n; i++) {
        list.push_front(random.nextInt(100));
        }
        //list.print();
        System.out.println();

/*        list.push_back(9999);
        list.print();
        list.pop_front();
        list.print();
        list.pop_back();
        list.print();*/
        /*System.out.print("Enter value : ");
        int value = scanner.nextInt();*/
        System.out.println();
     /*   System.out.print("Enter index : ");
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
        ForwardList d_list = new ForwardList();
        d_list.push_back(2.7);
        d_list.push_back(3.14);
        d_list.print();
        ForwardList s_list = new ForwardList<>();
        s_list.push_back("Хорошо");
        s_list.push_back("живет");
        s_list.push_back("на свете");
        s_list.push_back("Винни-пух");
        s_list.print();
        ForwardList s_list_2 = new ForwardList<>(s_list);
        s_list_2.push_back(3.14);
        s_list_2.push_back(true);
        s_list_2.print();

    }
}