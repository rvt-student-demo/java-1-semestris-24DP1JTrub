package rvt;

public class AdvancedAstrology {
    public static void main(String[] args) {
        //printSpaces(5);
        //printStars(5);
        //printTriangle(4);
        christmasTree(10);
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }
        for (int s = 0; s < 2; s++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }
}
