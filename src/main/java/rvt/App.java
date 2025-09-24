package rvt;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password?");
        String pass = "Caput Draconis";
        String userpass = scanner.nextLine();
        if (userpass.equals(pass)){
            System.out.println("Caput Draconis");
        } 
        else {
            System.out.println("Off with you!");
        }
        scanner.close();
    }
}

