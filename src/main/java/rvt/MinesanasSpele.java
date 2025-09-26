package rvt;
import java.util.Random;
import java.util.Scanner;

public class MinesanasSpele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nejausais = random.nextInt(10) + 1;
        int meginajumi = 3;

        System.out.println("Es domāju par skaitli no 1 līdz 10.");
        System.out.println("Tev tas jāuzmin trīs mēģinājumos.");

        for (int i = 1; i <= meginajumi; i++) {
            System.out.print("Ievadi minējumu: ");
            int guess = scanner.nextInt();

            if (guess == nejausais) {
                System.out.println("PAREIZI!");
                System.out.println("Tu esi uzvarējis spēli.");
                scanner.close();
                return;  
            } else {
                System.out.println("nepareizi");
            }
        }
        System.out.println("Pareizais skaitlis bija " + nejausais + ".");
        System.out.println("Tu esi zaudējis spēli.");
        scanner.close();
    }
}


