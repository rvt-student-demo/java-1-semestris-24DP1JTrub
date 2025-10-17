package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList {
    public static void main(String[] args) {
        //onlyTheseNumbers();
        //listSize();
        //onTheList();
        //RemoveLast();
    }
        

    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }

        System.out.print("From where? ");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.print("To where? ");
        int end = Integer.valueOf(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
        scanner.close();
    }

    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            names.add(name);
        }

        System.out.println("In total: " + names.size());
        scanner.close();
    }

    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            names.add(name);
        }

        System.out.print("Search for? ");
        String search = scanner.nextLine();

        if (names.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
        scanner.close();
    }

    public static void RemoveLast() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (!strings.isEmpty()) {
            strings.remove(strings.size() - 1);
        }
    }
}
