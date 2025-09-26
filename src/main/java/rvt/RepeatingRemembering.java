package rvt;

import java.util.Scanner;

public class RepeatingRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int even_count = 0;
        int odd_count = 0;

        System.out.println("Enter numbers, -1 to stop");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            sum += number;
            count++;

            if (number % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }

        if (count > 0) {
            double average = 1.0 * sum / count;
            System.out.println("Sum: " + sum);
            System.out.println("Numbers: " + count);
            System.out.printf("Average: %.2f%n", average);
            System.out.println("Even: " + even_count);
            System.out.println("Odd: " + odd_count);
        }

        scanner.close();
    }
}
