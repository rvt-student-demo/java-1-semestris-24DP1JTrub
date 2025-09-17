package rvt;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet pirmo skaiti: ");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadiet otro skaiti: ");
        int number2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Summa = " + (number1 + number2));
    }

}
