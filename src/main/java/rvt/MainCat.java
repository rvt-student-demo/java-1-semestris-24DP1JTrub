package rvt;

public class MainCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Persik", 5, "Orange");
        Cat cat2 = new Cat("Tima", 8, "Brown");
        
        System.out.println();
        System.out.println("First cat info:");
        System.out.println();

        cat1.eat();
        cat1.meow();
        cat1.info();

        System.out.println();
        System.out.println("Second cat info:");
        System.out.println();

        cat2.eat();
        cat2.meow();
        cat2.info();
        System.out.println();
    }
}
