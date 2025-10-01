package rvt;

public class IndeksaIzvade {
    public static void main(String[] args) {
        String name = "Katya";

        name.length();
        name.charAt(0); // pirmais burts, indekss
        name.indexOf("t"); // meklē burtu un atgriež tā indeksu
        name.substring(1, 4); // no indeksa 1 līdz 4 (4 neietilpst)
        name.toLowerCase(); // visi burti mazie
        name.toUpperCase(); // visi burti lielie
        ex1();
    }
    public static void ex1() {
        String name = "Katya";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("t"));
        System.out.println(name.substring(1, 4));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }
    public static void ex2() {
         
    }
    public static void ex3() {
}
}