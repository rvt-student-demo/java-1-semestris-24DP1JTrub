package rvt;

public class Loop {
    public static void main(String[] args) {
        int number = 5; {
    while (number > 0) {
        System.out.println(number);
        number = number - 1;
    }
        System.out.println("Ready!");
    }
    }
}