package app;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        // Створюємо список різних імен
        List<String> names = Arrays.asList("Tom", "Bob", "David", "Eva", "Jon");

        // Введення літери через Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть літеру: ");
        char selectedLetter = scanner.next().charAt(0);

        // Обираємо імена, які починаються з введеної літери
        List<String> selectedNames = names.stream()
                .filter(name -> name.startsWith(String.valueOf(selectedLetter)))
                .collect(Collectors.toList());

        // Виводимо вибірку з нумерацією елементів
        System.out.println("Вибірка імен, що починаються з літери '" + selectedLetter + "':");
        if (selectedNames.isEmpty()) {
            System.out.println("Імена з цією літерою відсутні.");
        } else {
            for (int i = 0; i < selectedNames.size(); i++) {
                System.out.println((i + 1) + ") " + selectedNames.get(i));
            }
        }

        int cnt =1;
        // Виводимо продовження списку імен без обраної літери
        System.out.println("\nПродовження списку імен без літери '" + selectedLetter + "':");
        boolean hasNamesWithoutLetter = false;
        for (String name : names) {
            if (!name.startsWith(String.valueOf(selectedLetter))) {
                System.out.println((cnt++)+")"+name);
                hasNamesWithoutLetter = true;
            }
        }

        // Виводимо повідомлення, якщо немає імен без обраної літери
        if (!hasNamesWithoutLetter) {
            System.out.println("Імена без цієї літери відсутні.");
        }
    }
}
