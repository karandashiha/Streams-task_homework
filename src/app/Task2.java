package app;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        // Створюємо перелік товарів і їх цін
        Map<String, Double> products = new HashMap<>();
        products.put("Banana", 2.50);
        products.put("Orange", 1.95);
        products.put("Apple", 2.00);
        products.put("Strawberry", 2.05);
        products.put("Coconut", 3.50);
        products.put("Pear", 1.15);

        // Діапазон цін від 1.05 до 3.15
        double minPrice = 1.05;
        double maxPrice = 3.15;

        // Вибірка товарів з цінами менше та дорівнюють 2.00
        Map<String, Double> selectedProducts = products.entrySet().stream()
                .filter(entry -> entry.getValue() <= 2.00 && entry.getValue() >= minPrice && entry.getValue() <= maxPrice)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Вибірка товарів з цінами менше та дорівнюють 2.00:");
        int i = 1;
        for (Map.Entry<String, Double> entry : selectedProducts.entrySet()) {
            System.out.println((i++) + ". " + entry.getKey() + " - " + entry.getValue());
        }
    }
}
