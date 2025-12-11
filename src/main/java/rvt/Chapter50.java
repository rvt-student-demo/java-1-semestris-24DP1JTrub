package rvt;

public class Chapter50 {

    private double width;
    private double height;
    private double length;

    // konstruktors ar trim izmēriem
    public Chapter50(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    // konstruktors kubam
    public Chapter50(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    // kopējošais konstruktors
    public Chapter50(Chapter50 oldBox) {
        this.width = oldBox.width();
        this.height = oldBox.height();
        this.length = oldBox.length();
    }

    // tilpums
    public double volume() {
        return width * height * length;
    }

    // laukums
    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    // privātās apakšmetodes
    private double faceArea() {
        return height * length;
    }

    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return width * height;
    }

    public double length() {
        return length;
    }

    public double height() {
        return height;
    }

    public double width() {
        return width;
    }

    // 25% lielāka kaste
    public Chapter50 biggerBox(Chapter50 oldBox) {
        return new Chapter50(
                oldBox.width() * 1.25,
                oldBox.height() * 1.25,
                oldBox.length() * 1.25
        );
    }

    // 25% mazāka kaste
    public Chapter50 smallerBox(Chapter50 oldBox) {
        return new Chapter50(
                oldBox.width() * 0.75,
                oldBox.height() * 0.75,
                oldBox.length() * 0.75
        );
    }

    // vai šī kaste ielien dotajā
    public boolean nests(Chapter50 outsideBox) {
        return this.width <= outsideBox.width() &&
               this.height <= outsideBox.height() &&
               this.length <= outsideBox.length();
    }
}
