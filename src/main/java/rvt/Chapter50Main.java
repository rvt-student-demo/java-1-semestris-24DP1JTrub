package rvt;

public class Chapter50Main {

    public static void main(String[] args) {

        Chapter50 box = new Chapter50(2.5, 5.0, 6.0);

        System.out.println("Area: " + box.area() + " volume: " + box.volume());

        System.out.println("length: " + box.length() +
                " height: " + box.height() +
                " width: " + box.width());

        Chapter50 cube = new Chapter50(3.0);
        System.out.println("Cube area: " + cube.area() +
                " volume: " + cube.volume());

        Chapter50 copy = new Chapter50(box);
        System.out.println("Copy dimensions: " + copy.length() +
                " " + copy.height() + " " + copy.width());

        Chapter50 bigger = box.biggerBox(box);
        Chapter50 smaller = box.smallerBox(box);

        System.out.println("Bigger box: " + bigger.length() +
                " " + bigger.height() + " " + bigger.width());

        System.out.println("Smaller box: " + smaller.length() +
                " " + smaller.height() + " " + smaller.width());

        System.out.println("smaller nests in bigger: " + smaller.nests(bigger));
        System.out.println("bigger nests in smaller: " + bigger.nests(smaller));
    }
}
