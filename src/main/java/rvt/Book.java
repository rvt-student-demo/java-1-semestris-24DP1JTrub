package rvt;

import java.util.Scanner;

public class Book {
    // Grāmatas nosaukums
    private String title;


    // Grāmatas lapasspuses
    private int pages;

    // Grāmatas izdošanas gads
    private int year;

    // Konstruktors
    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    // Nosaukuma iegūšana
    public String getTitle() {
        return title;
    }

    // Lappaspuses iegūšana
    public int getPages() {
        return pages;
    }

    // Gada iegūšana
    public int getYear() {
        return year;
    }


    

    // Grāmatas apraksts
    @Override
    public String toString() {
        return "Grāmata: " + title + ", pages: " + pages + ", year: " + year;
    }


    public static void main(String[] args) {
        // Ievades metoode
        Book book = new Book("Latvijas vēsture", 350, 2020);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadiet grāmatas nosaukumu: ");
        book.title = scanner.nextLine();
        System.out.print("Ievadiet grāmatas lappaspuses: ");
        book.pages = scanner.nextInt();
        System.out.print("Ievadiet grāmatas izdošanas gadu: ");
        book.year = scanner.nextInt();
        scanner.nextLine(); // Patērē jauno rindu
        System.out.println("");


        // Izveidojam jaunu grāmatu objektu
        System.out.println("Kādu informāciju par grāmatu vēlaties izvadīt? ");
        String info = scanner.nextLine();
        if (info.equals("visu")) {
            System.out.println("gramata: " + book.getTitle() + ", pages: " + book.getPages() + ", year: " + book.getYear());
        } else if (info.equals("nosaukumu")) {
            System.out.println("Grāmatas nosaukums: " + book.getTitle());
        } else if (info.equals("lappaspuses")) {
            System.out.println("Grāmatas lappaspuses: " + book.getPages());
        } else if (info.equals("gadu")) {
            System.out.println("Grāmatas izdošanas gads: " + book.getYear());
        }
         scanner.close();
    }
   
}