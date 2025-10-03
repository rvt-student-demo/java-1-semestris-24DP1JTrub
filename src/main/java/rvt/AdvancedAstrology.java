package rvt;

import java.util.Scanner;

public class AdvancedAstrology {
    public static void main(String[] args) {
        //printSpaces(5);
        //printTriangle(4);
        christmasTree(10);
    }
    public static void printSpaces(int number){
        Scanner scanner = new Scanner(System.in);
        System.out.println("uzraksti vārdu:");
        String word = scanner.nextLine();
        System.out.println("uzraksti otru vārdu:");
        String word2 = scanner.nextLine();

        System.out.println(word);
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
        
        System.out.println(word2);
        scanner.close();
    }

    public static void printTriangle(int size) {
    for (int i = 1; i <= size; i++) {
        for (int k = 1; k <= size - i; k++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void christmasTree(int height) {  
        for (int i = 1; i <= height; i++) {
            for (int k = 1; k <= height - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int s = 0; s < 2; s++) {
        for (int k = 1; k <= height - 2; k++) {
            System.out.print(" ");
        }
        System.out.println("***");
    }

    }
}
