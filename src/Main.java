

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size List:");
        int n = scanner.nextInt();
        ForwarList list = new ForwarList();
        for (int i = 0; i < n; i++) {
        list.push_front(random.nextInt(100));
        }
        list.print();
        System.out.println();

        list.push_back(9999);
        list.print();
    }
}