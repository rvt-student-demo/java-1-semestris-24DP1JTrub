package rvt;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int number2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number: ");
        int number3 = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + (number1 + number2 + number3) / 3);
        scanner.close();
    }
}
