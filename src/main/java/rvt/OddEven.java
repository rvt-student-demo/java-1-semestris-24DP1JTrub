package rvt;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int i = Integer.valueOf(scanner.nextLine());
        
        if (i % 2 == 0) {
            System.out.println("Number " + i + " is even.434");
        } else {
            System.out.println("Number " + i + " is odd.");
        }
            scanner.close();
        }
                
    }
    

