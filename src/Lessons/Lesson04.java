package Lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson04 {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Veta", "Lesha"};
        System.out.println(numbers[3]);
        System.out.println(names.length);
        numbers[3] = 100;
        System.out.println(numbers[3]);
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers) + Arrays.toString(names));

        //фактически уже коллекция а не массив
        List<String> list1 = new ArrayList<>(12);
        list1.add("Veta");
        list1.add("Veyiusia");
        list1.add("Vetochka");
        list1.add("Lisa");
        list1.addAll(Arrays.asList(names));
        String element = list1.get(2);
        int size = list1.size();
        System.out.println(list1);

        // Удаление по объекту
        list1.remove("B"); // [A, C, D]

        // Удаление по индексу
        list1.remove(0); // [C, D]

        // Удаление по условию (Java 8+)
        list1.removeIf(s -> s.startsWith("C")); // [D]

        // Очистка всего списка
        list1.clear(); // []

        //Методы
        //Метод без возвращаемого значения

    }
    public static void first_method(String n){
        System.out.println("Привет " + n);
    }
}
