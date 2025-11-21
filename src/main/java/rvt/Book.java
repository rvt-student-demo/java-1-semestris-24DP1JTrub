package rvt;

import java.util.Scanner;
import java.util.ArrayList;

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
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String title;
        int pages;
        int year;
        while (true) {
            System.out.print("Ievadiet grāmatas nosaukumu: ");
            title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Ievadiet grāmatas lappaspuses: ");
            pages = Integer.parseInt(scanner.nextLine());
            System.out.print("Ievadiet grāmatas izdošanas gadu: ");
            year = Integer.parseInt(scanner.nextLine());


            Book book = new Book(title, pages, year);
            books.add(book);
            System.out.println();

        continue;
        }

        // Izveidojam jaunu grāmatu objektu
        System.out.println("Kādu informāciju par grāmatu vēlaties izvadīt? ");
        String info = scanner.nextLine();
        if (info.equalsIgnoreCase("visu")) {
            for (Book b : books) {
            System.out.println("Grāmata: " + b.getTitle() + ", pages: " + b.getPages() + ", year: " + b.getYear());
            }
            } else if (info.equalsIgnoreCase("nosaukumu")) {
            for (Book b : books) {
            System.out.println("Grāmatas nosaukums: " + b.getTitle());
            }
            } else if (info.equalsIgnoreCase("lappaspuses")) {
            for (Book b : books) {
            System.out.println("Grāmatas lappaspuses: " + b.getPages());
            }
            } else if (info.equalsIgnoreCase("gadu")) {
            for (Book b : books) {
            System.out.println("Grāmatas izdošanas gads: " + b.getYear());
            }
            }

            scanner.close();
    }
   
}