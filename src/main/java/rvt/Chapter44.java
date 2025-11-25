package rvt;

import java.util.Scanner;
import java.util.Arrays;

public class Chapter44 {
    public static void main(String[] args) {
        ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();

    }

public static void ex1() {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        int spaceIndex = name.indexOf(" ");

        if (spaceIndex > 0) {
            String first = name.substring(0, spaceIndex);
            String last = name.substring(spaceIndex + 1).toUpperCase();
            System.out.println(first + " " + last);
        } else {
            System.out.println(name);
        }
    scanner.close();
}

public static void ex2() {
    System.out.println("Enter a string: ");
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    for (int i = 0; i <= word.length(); i++) {
        System.out.println(word.charAt(i));
    }
    System.out.println();
    scanner.close();
}

public static void ex3() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a name: ");
    String full = scanner.nextLine().trim();

    String name = full.split(" ")[0];

    String[] WomanNames = {"Amy", "Buffy", "Cathy"};
    String[] ManNames = {"Elroy","Fred","Graham"};

    if (Arrays.asList(WomanNames).contains(name)) {
        System.out.println("Ms. " + full);
    } else if (Arrays.asList(ManNames).contains(name)) {
        System.out.println("Mr. " + full);
    } else {
        System.out.println(full);
    }
    scanner.close();
}


public static void ex4() {
   Scanner s = new Scanner(System.in);

        System.out.print("Enter cook time-> ");
        int time = s.nextInt();

        int minutes;
        int seconds;

        if (time <= 99) { 
            // 2 or fewer digits → all are seconds
            minutes = 0;
            seconds = time;
        } else {
            // 3+ digits → last two digits are seconds
            minutes = time / 100;   // viss izņemot pēdējās divas zīmes
            seconds = time % 100;   // pēdējās divas zīmes
        }

        System.out.printf("Your time->  %d:%02d\n", minutes, seconds);
        s.close(); 
}

public static void ex5() {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();

        if (line.startsWith("//")) {
            System.out.println(line);
        }  
    }      
    scanner.close();
}

public static void ex6() {

    Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your password:");
            String pw = scanner.nextLine();

            // vai ir 7 zīmes
            if (pw.length() >= 7) {

                // vai ir gan lielie gan mazie burti
                if (!pw.equals(pw.toLowerCase()) && !pw.equals(pw.toUpperCase())) {

                    // vai satur vismaz vienu ciparu
                    boolean hasDigit = false;
                    for (int i = 0; i < pw.length(); i++) {
                        if (Character.isDigit(pw.charAt(i))) {
                            hasDigit = true;
                            break;
                        }
                    }

                    if (hasDigit) {
                        System.out.println("Acceptable password.");
                        break;
                    }
                }
            }

            System.out.println("That password is not acceptable.\n");
        }
    scanner.close();
    }

public static void ex7() {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word -->");
        String word = scanner.nextLine();

        int spaces = 0;

        while (word.length() > 0) {
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            System.out.println(word);

            if (word.length() > 2) {
                word = word.substring(1, word.length() - 1);
            } else {
                break;
            }

            spaces++;
        }
    scanner.close();
}

}