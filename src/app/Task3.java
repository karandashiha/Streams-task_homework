package app;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        // Заміряні температури протягом тижня
        Map<String, Integer> dailyTemperatures = new HashMap<>();
        dailyTemperatures.put("Monday ", 12);
        dailyTemperatures.put("Tuesday ", 8);
        dailyTemperatures.put("Wednesday", 14);
        dailyTemperatures.put("Thursday ", 10);
        dailyTemperatures.put("Friday ", 13);
        dailyTemperatures.put("Saturday ", 15);
        dailyTemperatures.put("Sunday", 11);

        // Діапазон температур від +8 до +15 градусів
        int minTemperature = 8;
        int maxTemperature = 15;

        // Вибірка щоденних показань температури в діапазоні від +10 до +13 градусів
        Map<String, Integer> selectedTemperatures = dailyTemperatures.entrySet().stream()
                .filter(entry -> entry.getValue() >= 10 && entry.getValue() <= 13)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Щоденні показання температури в діапазоні від +10 до +13 градусів:");
        int i = 1;
        for (Map.Entry<String, Integer> entry : selectedTemperatures.entrySet()) {
            System.out.println((i++) + ". " + entry.getKey() + ": " + entry.getValue() + " градусів");
        }
    }
}
