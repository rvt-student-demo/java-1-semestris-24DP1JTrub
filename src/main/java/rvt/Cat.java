package rvt;

public class Cat {
    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        
    }

    public void eat() {
        System.out.println(this.name + " is eating fish.");
    }

    public void meow() {
        System.out.println(this.name + " says Meow!");
    }
    public void info() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Color: " + this.color);
    }
}
