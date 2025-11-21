package rvt;

public class Product {
    // Produkta nosaukums
private String name;

// Produkta cena
private double price;

// Konstruktors
public Product(String name, double price) {
    this.name = name;
    this.price = price;
}

// Nosaukuma iegūšana
public String getName() {
    return name;
}

// Cenas iegūšana
public double getPrice() {
    return price;
}

// Cenas maiņa (ja vajag)
public void setPrice(double price) {
    this.price = price;
}

// Produkta apraksts
@Override
public String toString() {
    return "Prece: " + name + ", cena: " + String.format("%.2f", price) + " EUR";
}
}
// --------food product-------
class FoodProduct extends Product {
// Derīguma termiņš
private String expiryDate;

// Konstruktors
public FoodProduct(String name, double price, String expiryDate) {
    super(name, price);
    this.expiryDate = expiryDate;
}

// Derīguma termiņa iegūšana
public String getExpiryDate() {
    return expiryDate;
}

// Apraksts ar derīguma termiņu
@Override
public String toString() {
    return super.toString() + ", derīgs līdz: " + expiryDate;
}

}
// --------discount product-------

class DiscountProduct extends Product {
    // Atlaides procents
private int discountPercent;

// Konstruktors
public DiscountProduct(String name, double price, int discountPercent) {
    super(name, price);
    this.discountPercent = discountPercent;
}

// Atlaides procenta iegūšana
public int getDiscountPercent() {
    return discountPercent;
}

// Gala cena pēc atlaides
public double getFinalPrice() {
    double originalPrice = getPrice();
    double multiplier = 1 - (discountPercent / 100.0);
    return originalPrice * multiplier;
}

}

