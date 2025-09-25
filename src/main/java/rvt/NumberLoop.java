package rvt;

import java.util.Scanner;

public class NumberLoop {
    public static void main(String[] args) {
        int sum = 0; 
        int skaitlu_sk = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int skaits = Integer.parseInt(scanner.nextLine());

        while (skaits != 0) {
            skaitlu_sk++;
            sum += skaits;

            System.out.println("Give a number: ");
            skaits = Integer.parseInt(scanner.nextLine());
        }

        scanner.close();

        System.out.println("Number of numbers: " + skaitlu_sk);
        System.out.println("Sum of the numbers: " + sum);
    }
}
