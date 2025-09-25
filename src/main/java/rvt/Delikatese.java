package rvt;
import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi preci: ");
        String product = scanner.nextLine();

        System.out.println("Ievadi cenu: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Ekspress piegāde (0==nē, 1==jā): ");
        int express = Integer.parseInt(scanner.nextLine());

        scanner.close();

        double piegade;

        if (price >= 10) {
            piegade = 0;
        } else {
            piegade = 5;
        }

        double kopa = price + piegade;
        if (express == 1) {
            kopa += 3;
        }
        System.out.println("Rēķins:");
        System.out.println("    " + product + " " + price);
        System.out.println("    iegāde: " + piegade);
        System.out.println("    kopā: " + kopa);
    }
}
