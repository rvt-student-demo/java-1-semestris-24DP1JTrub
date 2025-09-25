package rvt;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skrūvju skaits: ");
        int screws = Integer.parseInt(scanner.nextLine());

        System.out.println("Uzgrieņu skaits: ");
        int nuts = Integer.parseInt(scanner.nextLine());

        System.out.println("Paplāksņu skaits: ");
        int washers = Integer.parseInt(scanner.nextLine());

        scanner.close();

        double price = (screws * 0.05) + (nuts * 0.03) + (washers * 0.01);

        if (nuts < screws) {
            System.out.println("Pārbaudi pasūtījumu: par maz uzgriežņu");
        } else if (washers < (screws * 2)) {
            System.out.println("Pārbaudi pasūtījumu: par maz paplāksņu");
        } else {
            System.out.println("Kopējā cena: " + price);
        }
    }
}
