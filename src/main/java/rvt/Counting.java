package rvt;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi skaitli: ");
        int skaitlis = scanner.nextInt();

        for (int i = 0; i <= skaitlis; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
