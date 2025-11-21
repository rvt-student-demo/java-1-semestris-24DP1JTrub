package rvt;
import java.util.Scanner;
public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();
        String correctPassword = "dragon fruit";

        if (inputPassword.equals(correctPassword)) {
            System.out.println("welkom");
        } else {
            System.out.println("off with youu");
        }
        scanner.close();
    }
}
