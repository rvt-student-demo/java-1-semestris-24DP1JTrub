package rvt;
import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 3, 5, 7, 9};

        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("\nGive two indices to swap:");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();

        System.out.println();
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;

        for (int num : numbers) {
            System.out.println(num);
        }

        scanner.close();
    }
}
