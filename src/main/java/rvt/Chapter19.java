package rvt;

import java.util.Scanner;

public class Chapter19 {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex4variants2();
        //ex5();
        //ex6();
        ex7();
    }
    public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Start: ");
        Integer start = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter End: ");
        Integer end = Integer.parseInt(scanner.nextLine());
        System.out.println(" ");
        for (int i = start; i <= end; i++) {
    
            System.out.println(i);
        
        }
        scanner.close();
    }
    public static void ex2() {
        int summa = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            summa = summa + i;
            
         }
        System.out.println("Loop Sum = " + summa);
        int FormulaSum = n*(n+1)/2;
        System.out.println("Formula Sum = " + FormulaSum);
        scanner.close();
    }
    public static void ex3() {
        int summaSquare = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            summaSquare = summaSquare + i*i;
    } 
       int FormulaSquareSum = n*(n+1)*(2*n+1)/6;
       System.out.println("Loop Square Sum = " + summaSquare);
       System.out.println("Formula Square Sum = " + FormulaSquareSum);
       scanner.close(); 
}
    public static void ex4() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter low: ");
        int low = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter high: ");
        int high = Integer.parseInt(scanner.nextLine());
        for (int i = low; i < high; i++) {
            sum = i * (i + 1) / 2;
        System.out.println("Sum = " + sum);

    }
    
    scanner.close();
} 
public static void ex4variants2() {

    int sum = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter low: ");
    int low = Integer.parseInt(scanner.nextLine());
    System.out.println("Enter high: ");
    int high = Integer.parseInt(scanner.nextLine());

    for (int i = low; i <= high; i++) {
        sum += i;  
    }

    System.out.println("Sum = " + sum); 
    scanner.close();
}
public static void ex5() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a word: ");
    String word = scanner.nextLine();
    int times = word.length();
    System.out.println(" ");
    for (int i = 0; i <= times; i++) {
        System.out.println(word);
}
    scanner.close();

    }
public static void ex6() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first word: ");
    String FirstWord = scanner.nextLine();
    System.out.println("Enter second word: ");
    String SecondWord = scanner.nextLine();
     int totalLength = 30;
        int punktusk = totalLength - (FirstWord.length() + SecondWord.length());

        System.out.print(FirstWord);

        for (int i = 0; i < punktusk; i++) {
            System.out.print(".");
        }
        System.out.println(SecondWord);

        scanner.close();
    }




public static void ex7() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a word: ");
    String word = scanner.nextLine();
    for (int i = 0; i < word.length(); i++) {
        System.out.println(word.charAt(i));
    
    }
    scanner.close();
}
}

    
