package rvt;
import java.util.ArrayList;

public class MainProduct {
    public static void main(String[] args) {

    // Produkcijas saraksts
    ArrayList<Product> products = new ArrayList<>();

    // Parasti produkti
    products.add(new Product("Krēsls", 49.99));
    products.add(new Product("Galda lampa", 19.90));

    // Pārtikas produkti
    products.add(new FoodProduct("Piens", 1.19, "2025-12-31"));
    products.add(new FoodProduct("Āboli", 2.49, "2025-11-30"));

    // Produkti ar atlaidi
    products.add(new DiscountProduct("Dators", 899.99, 15));
    products.add(new DiscountProduct("Austiņas", 59.99, 20));

    // Izvadām katalogu
    System.out.println("Veikala preču katalogs");
    System.out.println("----------------------");

    for (Product product : products) {
        System.out.println(product);
    }

    // Aprēķinām kopējo cenu
    double totalPrice = 0.0;

    for (Product product : products) {
        if (product instanceof DiscountProduct) {
            DiscountProduct dp = (DiscountProduct) product;
            totalPrice += dp.getFinalPrice();
        } else {
            totalPrice += product.getPrice();
        }
    }

    System.out.println();
    System.out.println("Kopējā cena (ņemot vērā atlaides): "
            + String.format("%.2f", totalPrice) + " EUR");
}

}
    