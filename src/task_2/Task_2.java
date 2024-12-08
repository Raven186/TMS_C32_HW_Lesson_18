package task_2;

import java.util.*;
import java.util.stream.Collectors;

public class Task_2 {
    public static void main(String[] args) {
        // Создаем коллекцию с именами студентов
        List<String> studentNames = Arrays.asList(
                "Иван", "Мария", "Анна", "Петр", "Алексей", "Елена", "Анастасия", "Дмитрий"
        );

        System.out.println("Список студентов: " + studentNames);

        // Ввод буквы с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите букву для фильтрации имен:");
        String inputLetter = scanner.nextLine().trim();

        // Выбрать имена, начинающиеся на введенную букву
        List<String> filteredNames = studentNames.stream()
                .filter(name -> name.toLowerCase().startsWith(inputLetter.toLowerCase()))
                .collect(Collectors.toList());

        System.out.println("Имена, начинающиеся на '" + inputLetter + "': " + filteredNames);

        // Отсортировать и вернуть первый элемент
        Optional<String> firstName = filteredNames.stream()
                .sorted()
                .findFirst();

        if (firstName.isPresent()) {
            System.out.println("Первое имя в отсортированном списке: " + firstName.get());
        } else {
            System.out.println("Нет имен, начинающихся на '" + inputLetter + "'.");
        }
    }
}
