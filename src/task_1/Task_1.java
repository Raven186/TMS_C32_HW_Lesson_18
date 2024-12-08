package task_1;

import java.util.*;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {
        // Создаем коллекцию и заполняем ее случайными числами
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(50)); // Числа от 0 до 49
        }

        System.out.println("Оригинальная коллекция: " + numbers);

        // Удалить дубликаты
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Уникальные числа: " + uniqueNumbers);

        // Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
        List<Integer> evenInRange = uniqueNumbers.stream()
                .filter(n -> n % 2 == 0 && n >= 7 && n <= 17)
                .collect(Collectors.toList());
        System.out.println("Четные числа в диапазоне от 7 до 17: " + evenInRange);

        // Умножить каждый элемент на 2
        List<Integer> multiplied = uniqueNumbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Умноженные на 2: " + multiplied);

        // Отсортировать и вывести первые 4 элемента
        List<Integer> sortedFirst4 = multiplied.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("Первые 4 элемента: " + sortedFirst4);

        // Вывести количество элементов в стриме
        long count = uniqueNumbers.stream().count();
        System.out.println("Количество элементов: " + count);

        // Вывести среднее арифметическое всех чисел в стриме
        double average = uniqueNumbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("Среднее арифметическое: " + average);
    }
}
